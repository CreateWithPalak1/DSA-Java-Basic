import java.util.Scanner;
class TwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = s.nextInt();

        System.out.println("Enter second number:");
        int num2 = s.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int multiply = num1*num2;
        int divide = num1/num2;

       

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
System.out.println("The multiply is: " + multiply);
System.out.println("The divide is: " + divide);

        s.close();
    }
}
