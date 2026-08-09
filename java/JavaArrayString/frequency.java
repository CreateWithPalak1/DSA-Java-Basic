import java.util.*;

public class frequency {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element");
        for(int i =1; i<= n;i++){
            list.add(sc.nextInt());
            System.out.println(i+" Frequency is "+Collections.frequency(list, i));
        }
    }
    
}
