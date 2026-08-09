import java.util.*;
public class Armstrongnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int q =n;
        while(n>0){
            int r = n%10;
            s = s+(r*r*r);
            n=n/10;
        }
        if(s==q){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
