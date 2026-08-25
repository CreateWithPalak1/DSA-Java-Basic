import java.util.*;
public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine().toLowerCase();
        String S2 = sc.nextLine().toLowerCase();

        char[]a = S1.toCharArray();
        char[]b = S2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("x is Anagram");
        }
        else{
            System.out.println("no");
        }
            

    }
}
