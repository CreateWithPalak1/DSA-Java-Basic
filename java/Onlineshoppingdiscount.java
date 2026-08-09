import java.util.Scanner;

public class Onlineshoppingdiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        int member = sc.nextInt();
        double discount = 0;
        if (bill>=2000 && member==1 ){
            discount=bill*0.20;
        }
        else if(bill>=2000 && member==0){
            discount = bill*0.10;
        }
            System.out.println(discount);
    sc.close();
    }
    
}
