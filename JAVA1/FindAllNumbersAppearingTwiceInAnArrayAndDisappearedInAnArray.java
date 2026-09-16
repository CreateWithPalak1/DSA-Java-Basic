import java.util.*;

public class FindAllNumbersAppearingTwiceInAnArrayAndDisappearedInAnArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int freq[] = new int[n + 1];

        for(int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        System.out.print("Appearing twice: ");

        for(int i = 1; i <= n; i++) {
            if(freq[i] == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Disappeared: ");

        for(int i = 1; i <= n; i++) {
            if(freq[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }
}