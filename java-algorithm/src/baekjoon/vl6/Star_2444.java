package baekjoon.vl6;

import java.io.*;

public class Star_2444 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2444

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            for (int i = 1,j = 0; i <= n; i++, j++) {
                bw.write(" ".repeat(n-i) + "*".repeat(i) + "*".repeat(j) + "\n");
            }
            for (int i = n - 1, j = n - 2; i > 0; i--, j--) {
                bw.write(" ".repeat(n - i) + "*".repeat(i) + "*".repeat(j) + "\n");
            }

            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
