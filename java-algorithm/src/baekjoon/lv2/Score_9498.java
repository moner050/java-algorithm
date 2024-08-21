package baekjoon.lv2;

import java.io.*;

public class Score_9498 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/9498
         시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int score = Integer.parseInt(br.readLine());

            if(score <= 100 && score >= 90) {
                bw.write("A");
            }
            else if(score < 90 && score >= 80) {
                bw.write("B");
            }
            else if(score < 80 && score >= 70) {
                bw.write("C");
            }
            else if(score < 70 && score >= 60) {
                bw.write("D");
            }
            else {
                bw.write("F");
            }

            bw.close();
        }
        catch (IOException e) {
            throw new RuntimeException("점수가 잘못 입력되었습니다.");
        }
    }
}
