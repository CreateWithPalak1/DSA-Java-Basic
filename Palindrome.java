import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        int q = 0;
        int temp = 0;
        temp = n;
        while(n>0){
            int digit = n%10;
            q = q*10+ digit;
            n = n/10;
        }
        if(temp==q){
            System.out.print("Palindrome"); 
        }else{
            System.out.print("Not a Palindrome");
        }
    }
}
