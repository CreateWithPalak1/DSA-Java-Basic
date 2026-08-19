import java.util.*;

class Frequencyofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            int count = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            // print only first time
            if(s.indexOf(s.charAt(i)) == i){
                System.out.println(s.charAt(i) + " = " + count);
            }
        }
    }
}