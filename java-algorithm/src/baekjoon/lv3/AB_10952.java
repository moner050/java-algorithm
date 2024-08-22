package baekjoon.lv3;

import java.io.*;
import java.util.Arrays;

public class AB_10952 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10952
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            while(true) {
                int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int a = input[0], b = input[1];

                if(a == 0 && b == 0) {
                    break;
                }

                bw.write((a + b) + "\n");
                bw.flush();
            }

            bw.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
