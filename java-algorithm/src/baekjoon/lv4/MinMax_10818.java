package baekjoon.lv4;

import java.io.*;
import java.util.Arrays;

public class MinMax_10818 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10818
        // N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if(input[i] < min) {
                    min = input[i];
                }
                if(input[i] > max) {
                    max = input[i];
                }
            }

            bw.write(min + " " + max);
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
