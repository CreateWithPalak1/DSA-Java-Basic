import java.util.Scanner;

class Userinput {
   Userinput() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter the first number");
      int var2 = var1.nextInt();
      System.out.println("enter the second number");
      double var3 = var1.nextDouble();
      System.out.println("enter the third number");
      float var5 = var1.nextFloat();
      System.out.println("enter the Boolean value");
      Boolean var6 = var1.nextBoolean();
      System.out.println("the first number is " + var2);
      System.out.println("the second number is " + var3);
      System.out.println("the third number is " + var5);
      System.out.println("the Boolean value is " + var6);
      var1.close();
   }
}
