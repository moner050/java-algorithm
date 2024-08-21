package baekjoon.lv2;

import java.io.*;

public class Compare_1330 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/1330
         두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if(a > b) {
                bw.write(">");
            }
            else if(a < b) {
                bw.write("<");
            }
            else {
                bw.write("==");
            }

            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값에 오류가 발생했습니다.");
        }
    }
}
