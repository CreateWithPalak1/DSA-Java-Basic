import java.util.*;
public class EmptyStringOrNot {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     // case for checking empty 
     String s = "";
     System.out.println(s.length());
     
     if(s.isEmpty()){
        System.out.println("String is Empty");
     }
     else{
        System.out.println("not empty");
     }
      //case for not empty
     String S = sc.nextLine();
     System.out.println(S.length());
     if(S.isEmpty()){
        System.out.println("String is Empty");
     }
     else{
        System.out.println("not empty");
     }
     
 }
}
