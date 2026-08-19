import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // First ascending

        for(int i=n-1;i>=0;i--){   // Print reverse
            System.out.print(arr[i] + " ");
        }
    }
}