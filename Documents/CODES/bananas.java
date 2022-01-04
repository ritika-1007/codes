import java.io.*;
import java.util.*;

public class bananas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String out_ = solve(N);
            wr.println(out_);
        }

        wr.close();
        br.close();
    }

    static String solve(int N) {
        // Your code goes here
        int c = 0;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                c++;

            }

        }
        if (c == 0)
            return "No";
        else
            return "Yes";

    }

}