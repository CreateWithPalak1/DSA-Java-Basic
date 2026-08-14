import java.util.*;

public class FrequencyCharacter {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
   for(int i=0;i<S.length();i++){
    int count =0;
            for(int j=0;j<S.length();j++){
               if( S.charAt(i)==S.charAt(j)){
                count++;
               }
            }
            System.out.println(S.charAt(i) +" "+count);
        }
   }
}
