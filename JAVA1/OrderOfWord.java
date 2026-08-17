import java.util.Scanner;

public class OrderOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String [] words = S.split("");
        for(int i =words.length - 1;i>=0; i-- ){
            System.out.println(words[i]+"");
        }
        
    }
}
