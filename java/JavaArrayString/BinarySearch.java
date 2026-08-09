import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int key = sc.nextInt();

        int l=0, r=n-1;
        boolean found=false;

        while(l<=r){
            int mid=(l+r)/2;

            if(arr[mid]==key){
                System.out.println("Found");
                found=true;
                break;
            }
            else if(arr[mid]<key) l=mid+1;
            else r=mid-1;
        }

        if(!found) System.out.println("Not Found");
    }
}