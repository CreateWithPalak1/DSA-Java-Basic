import java.util.Scanner;

public class ReverseSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n ;i++){
                sum = sum + arr[i];
        }
        for(int i=0; i<n;i++){
         arr[i]=sum-arr[i];
         sum = arr[i];
        System.out.println(arr[i]);
        }
    }
}
