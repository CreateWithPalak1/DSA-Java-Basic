import java.util.*; 
public class BothNumbersEven {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if( m%2==0 && n% 2==0){
         System.out.println("Both are even");
        }
        else{
            System.out.println("Both are not even");
        }

    }
}
