import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long sum =0;

        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            sum = sum + num;
        }
        double average = (double)sum/n;
        System.out.printf("average:%.2f",average);
    }
}
