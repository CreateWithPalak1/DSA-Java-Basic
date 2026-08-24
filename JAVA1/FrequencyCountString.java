import java.util.*;
public class FrequencyCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean a[]= new boolean[S.length()];
        for(int i = 0; i<S.length(); i++ ){
            if(a[i]) continue;
            int count = 1;
            for(int j = i+1; j<S.length(); j++){
                if(S.charAt(i)==S.charAt(j)){
                    count ++;
                    a[j]= true;
                }
            }
            System.out.println(S.charAt(i)+""+count);
        }
    }
}
