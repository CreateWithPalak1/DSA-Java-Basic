import java.util.Scanner;

public class Disariumnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = n, sum = 0, count = 0;

        while (t > 0) {
            count++;
            t /= 10;
        }

        t = n;

        while (t > 0) {
            int d = t % 10;

            int power = 1;
            for (int i = 1; i <= count; i++)
                power = power* d;

            sum = sum + power;
            count--;
            t /= 10;
        }

        if(sum == n){ 
            System.out.println("Disarium Number");
        }
        else{ 
            System.out.println( "Not a Disarium Number");
        sc.close();
        }
    }
}