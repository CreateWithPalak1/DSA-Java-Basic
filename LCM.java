import java.util.*;
public class LCM {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 =a, n2 =b;
        while(b!=0){
            int temp = b;
            b= a%b;
            a= temp;

        }
        System.out.println((n1*n2)/a);
        sc.close();
    }
}
