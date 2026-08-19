import java.util.*;

public class DuplicateElementsofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            boolean printed = false;

            // check if already printed
            for(int k=0;k<i;k++){
                if(arr[i] == arr[k]){
                    printed = true;
                    break;
                }
            }

            if(printed) continue;

            // check duplicate
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}