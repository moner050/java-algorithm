package baekjoon.lv3;

import java.io.*;
import java.util.Arrays;

public class AB_10951 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10951
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String str;
            while((str = br.readLine()) != null) {
                int[] input = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

                int a = input[0], b = input[1];

                bw.write((a + b) + "\n");
                bw.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
