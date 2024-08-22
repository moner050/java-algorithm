package baekjoon.lv3;

import java.io.*;
import java.util.Arrays;

public class FastAB_15552 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/15552

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int a = input[0], b = input[1];

                bw.write((a + b) + "\n");
            }

            bw.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
