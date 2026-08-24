import java.util.Scanner;
public class MergeTwoAlternativeString {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();

      int i=0; 
      int j=0;
      String ans=" ";
      while(i<a.length() || j<b.length()){
        if(i<a.length()) {
            ans +=a.charAt(i);
            i++;
        }
        if(j<b.length()){
            ans +=b.charAt(j);
            j++;
        }

      }

 System.out.println(ans);

    }
}
