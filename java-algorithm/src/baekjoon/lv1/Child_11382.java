package baekjoon.lv1;

import java.io.*;

public class Child_11382 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/11382
         꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");

            if (input.length < 3) {
                throw new RuntimeException();
            }

            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            long c = Long.parseLong(input[2]);

            long result = a + b + c;

            bw.write(String.valueOf(result));
            bw.close();
        } catch (Exception e) {
            throw new RuntimeException("오류가 발생했습니다.");
        }
    }
}
