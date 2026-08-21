import java.util.*;

class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

String[] words = s.split(" ");

for(int i = 0; i < words.length; i++) {
    for(int j = i + 1; j < words.length; j++) {
        if(words[i].equals(words[j])) {
            System.out.println(words[i]);
        }
    }
}
}           
}