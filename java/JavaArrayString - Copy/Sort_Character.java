import java. util.*;
public class Sort_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}
