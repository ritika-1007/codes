/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class asmgame1 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int res = a[0];
            for (int i = 1; i < n; i++) {
                res = gcd(a[i], res);
            }
            System.out.println(res);

        }
    }

    public static int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }
}