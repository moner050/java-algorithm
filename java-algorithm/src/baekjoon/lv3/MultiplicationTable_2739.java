package baekjoon.lv3;

import java.io.*;

public class MultiplicationTable_2739 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/2739
         N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            if(n > 9 || n < 1) {
                throw new RuntimeException();
            }

            for (int i = 1; i <= 9; i++) {
                bw.write(n + " * " + i + " = " + (n * i) + "\n");
            }

            bw.close();
            br.close();
        }
        catch (IOException e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
