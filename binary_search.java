import java.util.*;

public class binary_search {

    /*public static int bsearch(int[] a,int n,int y){
        int l=0 , h=n-1;
        int ans=Integer.MIN_VALUE;
        while(l<=h){
            int mid = (h+l)/2;
            if(a[mid]<=y){
                l = mid+1;
                ans = a[mid];
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }*/

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = k.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = k.nextInt();
        }


        //***find max element x s.t. x<=y***
        //Arrays.sort(a);
        // System.out.println("Enter value of y : ");
        // int y = k.nextInt();
        // System.out.println("Enter no. of query : ");
        // int q = k.nextInt();
        // System.out.println("Enter query array : ");
        // int[] query = new int[q];
        // for (int i = 0; i < q ; i++) {
        //     query[i] = k.nextInt();
        // }
        // int[] res = new int[q];
        // for (int i=0 ; i<q ; i++){
        //     res[i] = bsearch(a,n,query[i]);
        // }
        // for (int e : res) System.out.println(e);


        //***find first and last occ of an ele y***
        // System.out.println("Enter value of y : ");
        // int y = k.nextInt();
        // int l=0 , h=n-1 , fo=-1 , lo=-1;
        // while(l<=h){
        //     int mid = (l+h)/2;
        //     if(a[mid]==y && (mid==0 || a[mid-1]!=y)){
        //         fo = mid;
        //         break;
        //     }
        //     else if(a[mid]<y){l = mid+1;}
        //     else {h = mid-1;}
        // }
        // l=0 ; h=n-1 ;
        // while(l<=h){
        //     int mid = (l+h)/2;
        //     if(a[mid]==y && (mid==n-1 || a[mid+1]!=y)){
        //         lo = mid;
        //         break;
        //     }
        //     else if(a[mid]>y){h = mid-1;}
        //     else {l = mid+1;}
        // }
        // System.out.println("First occurrence : "+fo);
        // System.out.println("Last occurrence : "+lo);
        // int freq = lo-fo+1;
        // System.out.println("Frequency : "+freq);
        

        //***find single element in an array of elements in pairs(1,1,2,2,3,4,4,5,5)***
        int l=0 , h=n-1;
        int ans = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]!=a[mid-1] && a[mid]==a[mid+1]){           //check for first occ
                if(mid%2==0) l = mid+1;
                else h = mid-1;
            }
            else if(a[mid]!=a[mid+1] && a[mid]==a[mid-1]){       //check for second occ
                if(mid%2!=0)l = mid+1;
                else h = mid-1;
            }
            else{
                ans = mid;
                break;
            }
        }
        System.out.println("Element at "+ans+"th position is : "+a[ans]);


        
    }

}
