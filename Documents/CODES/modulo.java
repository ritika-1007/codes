import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i] % m;
            }
            int arr[] = new int[1001];// frequency
            for (int i = 0; i < n; i++) {
                arr[b[i]]++;
            }
            int unique = 0, rep = 0;
            for (int i = 0; i < 1001; i++) {
                if (arr[i] == 1)
                    unique++;
                if (arr[i] > 1)
                    rep++;
            }
            System.out.println(unique + rep);
            System.out.println(unique);
        }

    }
}