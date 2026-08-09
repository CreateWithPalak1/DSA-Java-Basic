import java.util.Scanner;

public class Neonnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int q = n * n;
        int sum = 0;

        while (q > 0) {
            int d = q % 10;
            sum = sum+d;
            q = q/10;
        }

        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
        sc.close();
    }
}