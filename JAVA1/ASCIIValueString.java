import java.util.*;
public class ASCIIValueString {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
       for(int i = 0; i < n && i < S.length(); i++){
         char ch = S.charAt(i);
         System.out.println(ch + " " + (int) ch);
        
     }
      int freq[]= new int[26];
      for(char i: S.toCharArray())
        freq(i-97)++;
      for(int i = 0; i<=26; i++){
        if(freq[i]) 
      }

    }
}
