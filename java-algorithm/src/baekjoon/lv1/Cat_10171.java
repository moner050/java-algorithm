package baekjoon.lv1;

import java.io.*;

public class Cat_10171 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/10171
         아래 예제와 같이 고양이를 출력하시오.
         \    /\
         )  ( ')
         (  /  )
         \(__)|
         */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write(
                    "\\    /\\\n" +
                    " )  ( \')\n" +
                    "(  /  )\n" +
                    " \\(__)|"
            );

            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력 오류가 발생하였습니다.");
        }
    }
}
