import java.util.Scanner;

public class Loaneligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entr your age");
        int age = sc.nextInt();

        System.out.println("enter your monthly salary");
        double salary = sc.nextDouble();

        System.out.println("enter your credit score");
        int creditscore = sc.nextInt();

        if(age>=21 && salary>=30000 && creditscore >= 700)
            System.out.println("loan approved");
        else
            System.out.println("loan rejected");
        sc.close();
    }
}
