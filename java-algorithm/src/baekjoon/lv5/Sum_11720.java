package baekjoon.lv5;

import java.io.*;
import java.util.Arrays;

public class Sum_11720 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/11720

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine()), sum = 0;
            int[] numbers = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < n; i++) {
                sum += numbers[i];
            }

            bw.write(String.valueOf(sum));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
