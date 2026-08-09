import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
   Scanner sc = new Scanner (System.in);
   int n = sc.nextInt();
     for(int i = 2;i<=n;i++){
        
        if(n%i==0){
            System.out.println("Not prime");
            return;
        }   
        
     }
     if(n<2){
        System.out.println("Not prime");
        return;
     }
     else{
     System.out.println("Prime");
}  
 }
}
