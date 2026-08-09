import java.util.Scanner;

public class Spynumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, product = 1;
        int temp = n;

        while (temp > 0) {
            int d = temp % 10;
            sum = sum +d;
            product = product*d;
            temp = temp/ 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
        sc.close();
    }
}
    