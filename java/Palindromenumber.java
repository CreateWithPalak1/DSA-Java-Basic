import java.util.Scanner;

public class Palindromenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        int temp = n;
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev =rev*10+d;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindromenumber");
        }
        else{
            System.out.println("not Palindromenumber");
        }
        sc.close();
    }
}