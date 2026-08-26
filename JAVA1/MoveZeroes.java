import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }

        while (j < a.length) {
            a[j++] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}