import java.util.*;
public class Check_only_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        for(int i = 0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
