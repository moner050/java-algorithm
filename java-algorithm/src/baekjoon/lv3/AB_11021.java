package baekjoon.lv3;

import java.io.*;
import java.util.Arrays;

public class AB_11021 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/11021
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(br.readLine());

            for (int i = 1; i <= t; i++) {
                int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int a = input[0], b = input[1];

                bw.write("Case #" + i + ": " + (a+b) + "\n");
                bw.flush();
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException("잘못 입력되었습니다.");
        }
    }
}
