package baekjoon.lv1;

import java.io.*;

public class Multiplication_2588 {
    public static void main(String[] args) {
        /**
         * https://www.acmicpc.net/problem/2588
         (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
         (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input1 = br.readLine();
            String input2 = br.readLine();

            if(input1.length() != 3 || input2.length() != 3) {
                throw new RuntimeException();
            }

            int target = Integer.parseInt(input1);

            for(int i = input2.length() - 1 ; i >= 0; i--) {
                int tmp = input2.charAt(i) - 48;
                bw.write((target * tmp) + "\n");
            }

            bw.write(String.valueOf(target * Integer.parseInt(input2)));
            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("숫자가 잘못 입력되었습니다.");
        }

    }
}
