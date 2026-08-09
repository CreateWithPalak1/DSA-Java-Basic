import java.util.Scanner;

public class ducknumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        int temp = n;
        boolean isDuck = false;
        while(temp > 0) {
            int rem = temp%10;
            if(rem==0){
                isDuck = true;
                break;
            }
            temp = temp/10;
        }
        if(isDuck){
            System.out.println("duck number"+n);
        }
        else{
            System.out.println("is not duck number"+n);
        }
        s.close();
    }
    
}
