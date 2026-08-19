import java.util.*;
public class PalindromeString1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String Str = sc.nextLine();
        StringBuffer sb = new StringBuffer(Str);
            System.out.println(sb.reverse());
            String rev = sb.reverse().toString();
        if(Str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not");
        }


    }
}

