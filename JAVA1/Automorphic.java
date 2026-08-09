import java.util.*;
public class Automorphic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Square = n*n;
        if(Square%10==n%10){
         System.out .println("Automorphic number");
        }      
        else {
    System.out.println("not");
      }  
    }
}
