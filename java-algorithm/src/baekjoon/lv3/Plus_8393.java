package baekjoon.lv3;

import java.io.*;

public class Plus_8393 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/8393
         n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            if(n < 1 || n > 10000) {
                throw new RuntimeException();
            }

            int result = 0;

            for (int i = 1; i <= n; i++) {
                result += i;
            }

            bw.write(String.valueOf(result));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("잘못 입력되었습니다.");
        }
    }
}
