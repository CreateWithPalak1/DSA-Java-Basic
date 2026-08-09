import java.util.*;
public class Electricity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int bill = 0;
        if(unit<=100){
            bill = unit*5;
        }
            else if(unit<=200){
                bill =unit*5 + (unit-100)*7;
            }    
                else
               bill=unit*5+(unit-200)*10;
        System.out.println("Bill is: "+bill);
    }
}
