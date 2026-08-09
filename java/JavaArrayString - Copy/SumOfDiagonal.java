import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];     
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }         
        System.out.println("The diagonal elements are:");
        for (int i = 0; i < n; i++) {   
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " "); 
                }
            }
        }
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum = sum +arr[i][i];
        }   
        System.out.println("The sum of diagonal elements is: " + sum);

    }
}
