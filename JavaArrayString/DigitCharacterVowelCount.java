import java.util.*;
public class DigitCharacterVowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int d =0;
        int c=0;
        int v=0;
        int con =0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                d++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    v++;
                } else {
                    con++;
                }
            }
        }
        System.out.println("Digits: " + d); 
        System.out.println("Characters: " + c);
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + con);
    }
}
    
       