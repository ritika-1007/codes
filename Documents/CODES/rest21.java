import java.util.*;

class rest21 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            String s = String.valueOf(n);
            if (s.contains("21") || n % 21 == 0)
                System.out.println("The streak is broken!");
            else
                System.out.println("The streak lives still in our heart!");
        }
    }
}