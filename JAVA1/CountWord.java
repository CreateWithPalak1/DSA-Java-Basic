import java.util.*;
public class CountWord {
    public static void main(String ars[]){
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.nextLine().trim();
            if(S.isEmpty()){
                System.out.println("words = 0");
            }
            else{
                String[] words = S.split("\\s+");
                System.out.println(words.length);
            }
        }
    }
}
