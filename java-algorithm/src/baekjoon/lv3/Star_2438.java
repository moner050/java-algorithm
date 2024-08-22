package baekjoon.lv3;

import java.io.*;

public class Star_2438 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2438
        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            if(n < 1 || n > 100) {
                throw new RuntimeException();
            }

            String star = "*";
            for (int i = 1; i <= n; i++) {
                bw.write(star.repeat(i) + "\n");
            }
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
