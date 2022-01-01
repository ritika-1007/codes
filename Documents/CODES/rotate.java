
import java.util.*;
import java.io.*;

class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            // part 1
            reverse(a, 0, d - 1);
            // part 2
            reverse(a, d, n - 1);
            // overall
            reverse(a, 0, n - 1);

            for (int item : a)
                System.out.print(item + " ");

            System.out.println();
        }
    }

    public static void reverse(int a[], int m, int n) {
        int li = m, ri = n;
        while (li < ri) {

            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }

}