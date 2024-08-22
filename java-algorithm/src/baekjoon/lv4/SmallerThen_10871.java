package baekjoon.lv4;

import java.io.*;
import java.util.Arrays;

public class SmallerThen_10871 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10871
        // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[] nx = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = nx[1];
            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .filter(num -> num < x)
                    .toArray();

            for (int num : input) {
                bw.write(num + " ");
            }

            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
