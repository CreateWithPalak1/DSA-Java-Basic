import java.util.*;

public class CountNonRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int  max =0,count =0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int a[] = new int[max+1];
        for(int i=0;i<arr.length;i++)
            a[arr[i]]++;
        for(int i=0;i<a.length;i++){
            if(a[i]==1) count++;
        }
       System.out.println(count);
    }
}
