import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
       System.out.println(x+" "+y);
       Scanner scanner = new Scanner(System.in);
       s.close();
       scanner.close();
}
    
}
