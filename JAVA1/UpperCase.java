import java.util.*;
public class UpperCase {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String R ="";
    for(int i = 0; i<str.length();i++){
        char ch = str.charAt(i);
        if(ch>='a'&& ch<='z') {
            ch = (char)(ch-32);
        }
        R += ch;
   } 
   System.out.println(R);
}
}
