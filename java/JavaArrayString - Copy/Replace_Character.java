import java.util.Scanner;

public class Replace_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace('l','x');
        System.out.println(s);
    }
}
