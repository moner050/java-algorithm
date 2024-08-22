package baekjoon.lv3;

import java.io.*;

public class AB_10950 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/10950
         두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                if(a < 0 || b > 10) {
                    throw new RuntimeException();
                }

                bw.write((a + b) + "\n");
                bw.flush();
            }
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
