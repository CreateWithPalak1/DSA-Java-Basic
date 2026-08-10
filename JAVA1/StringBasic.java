import java.util.*;
public class StringBasic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        //find the length of string
        int length = S.length();
        System.out.println(length);
        //Print every character
        for(int i=0;i<S.length();i++){
            System.out.print(S.charAt(i));
        }
        System.out.println();
        
        int vowels =0;
        int consonants =0;
        int spaces =0;
        int digits = 0;
        String reversed ="";
        String lowerS = S.toLowerCase();
        for(int i = 0; i<S.length(); i++){
            char ch = lowerS.charAt(i);
            char originalCh = S.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a'&&ch<='z'){
                consonants++;
            }
            if(originalCh==' '){
                spaces++;
            }
            if(originalCh>='0' && originalCh<='9'){
                digits++;
            }
            reversed= originalCh + reversed;
        }
            System.out.println(vowels);
            System.out.println(consonants);
            System.out.println(spaces);
            System.out.println(reversed);
            boolean ispalindrome = S.equalsIgnoreCase(reversed);
            System.out.println(ispalindrome);
            System.out.println(spaces);
            System.out.println(digits);
             
            String upper= S.toUpperCase();
            System.out.println(upper);

            String noSpaces = S.replace(" "," ");
            System.out.println(noSpaces);
        
            sc.close();
    }
    
}
