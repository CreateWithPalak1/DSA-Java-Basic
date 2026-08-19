import java.util.*;
public class Split_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr =s.split(" ");
        for(String word: arr){
            System.out.println(word);
        }
    }
}
