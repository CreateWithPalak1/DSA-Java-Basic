import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci series");
        for(int i= 0; i<=n; i++){
            System.out.println(a+" ");
            int c=a+b;
                 a=b;
                 b=c;
                 sc.close();
        }
    
    }
}
    