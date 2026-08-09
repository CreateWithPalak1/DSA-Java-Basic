import java.util.Scanner;

public class Kaprekarnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int square = n*n;
        int temp = n;
        int d = 0;
        while(temp>0){
            d++;
        temp=temp/10;
        }
        int div = 1;
        for(int i=0; i<d; i++){
            div = div *10;
        }
        int right = square% div;
        int left = square/div;
        
        if(left + right == n){
            System.out.println("Kaprekar number");
        }
        else{
            System.out.println(" not Kaprekar number");
        }
        
        sc.close();
    }
    
}
