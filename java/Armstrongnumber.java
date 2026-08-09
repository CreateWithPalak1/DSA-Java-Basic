import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            System.out.println("enter the number");
            int n = sc.nextInt();
            int count =0;
            int temp = n;
            int temp1 = n;
            while(temp != 0){
                temp = temp/10;
                count++;
            }
            double sum = 0;
            while(temp1 != 0){
               int rem = temp1%10;
               sum = sum+Math.pow(rem,count);
               temp1 = temp1/10;
            }
            if(sum==n){
                System.out.println("is Armstrong number"+n);
            }
            else{
                System.out.println("is not Armstrong number"+n);
            }
            sc.close();
    }
    
}
