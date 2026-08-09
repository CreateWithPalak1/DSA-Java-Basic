import java.util.Scanner;

public class Bankriskevaluation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int age = sc.nextInt();
        int salary = sc.nextInt();
        int creditScore = sc.nextInt();
        boolean hasExistingLoan = sc.nextBoolean();

        // Logic
        if (age < 21) {
            System.out.println("Reject");
        }
        else if (creditScore < 650) {
            System.out.println("Reject");
        }
        else if (salary >= 40000 || (salary >= 25000 && !hasExistingLoan)) {
            System.out.println("Approve");
        }
        else {
            System.out.println("Review Pending");
        }

        sc.close();
    }
}
