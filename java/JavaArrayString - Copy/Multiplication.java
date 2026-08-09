import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size");
            int n = sc.nextInt();
            int[]arr = new int[n];
            System.out.println("enter the elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the number to multiply");
            int num = sc.nextInt();
            System.out.println("the result of multiplication is:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] * num + " ");
            }
    }
}