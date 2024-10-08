package baekjoon.lv2;

import java.io.*;

public class Quadrant_14681 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/14681
         흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
         사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
         예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
         점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            if((x > 1000 || x < -1000 || x == 0) || (y > 1000 || y < -1000 || y == 0)) {
                throw new RuntimeException();
            }

            if(x > 0) {
                if(y > 0) {
                    bw.write("1");
                }
                else {
                    bw.write("4");
                }
            }
            else {
                if(y > 0) {
                    bw.write("2");
                }
                else {
                    bw.write("3");
                }
            }

            bw.close();
        }
        catch (IOException e) {
            throw new RuntimeException("입력값이 잘못 되었거나 출력 오류가 발생하였습니다.");
        }
    }
}
