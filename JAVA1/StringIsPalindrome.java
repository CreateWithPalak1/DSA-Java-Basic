import java.util.*;
public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l=0;
        int r =s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println(s + " is not a palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println(s + " is a palindrome");
        return;
    }
}
