import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;
        int max = 0;

        while (i < j) {

            int min = Math.min(arr[i], arr[j]);
            int cap = min * (j - i);

            max = Math.max(max, cap);

            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Maximum Water: " + max);

        sc.close();
    }
}