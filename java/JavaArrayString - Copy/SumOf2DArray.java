import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m= sc.nextInt();
        System.out.println("Enter the number of columns:");
         int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix:");    
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of the elements in the 2D array is: " + sum);
        sc.close();
        
    }
}
