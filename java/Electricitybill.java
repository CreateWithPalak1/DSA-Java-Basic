import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter units consumed");
        int unit = s.nextInt();

        double amount = 0;

        if(unit <= 100)
            amount = unit*1;
        else if(unit <= 300)
            amount = 100*1+(unit - 100)*2;
        else
            amount = 100*1+200*2+(unit - 300)*3;
        System.out.println("the final amount is "+amount);
        s.close();
}
}
