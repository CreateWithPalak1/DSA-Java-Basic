import java.util.*;
public class SumEvenumOdd {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long even = 0;
        long odd = 0;
        for(int i = 0; i<n ;i++){
            long num = sc.nextLong();
            if(num%2==0){
                even = even + num;
            }
            else{
              odd = odd+ num;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
