import java.util.Scanner;

public class Xylemnumber {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int n = sc.nextInt();
       
        System.out.println("Enter the number");
        int temp = n;

        int outerSum = 0;
        int middleSum = 0;

        // Last digit
        int last = n % 10;
        outerSum += last;
        n = n / 10;

        // First digit
        int first = 0;
        while (n >= 10) {
            int d = n % 10;
            middleSum += d;
            n = n / 10;
        }

        first = n;
        outerSum += first;

        if (outerSum == middleSum)
            System.out.println(temp + " is a Xylem Number");
        else
            System.out.println(temp + " is NOT a Xylem Number");
        sc.close();
    }
}
    

