import java.util.*;

public class Frequencyofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            boolean visited = false;

            // check if already counted
            for(int k=0;k<i;k++){
                if(arr[i] == arr[k]){
                    visited = true;
                    break;
                }
            }

            if(visited) continue;

            int count = 1;

            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}