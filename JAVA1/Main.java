import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum =0;
        while(n>0){
            long digit = n%10;
            sum = sum + digit;
            n=n/10;

        }
        System.out.println(sum);
    }
}