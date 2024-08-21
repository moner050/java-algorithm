package baekjoon.lv1;

import java.io.*;

public class OMG_10926 {
    public static void main(String[] args) {
        // 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
        // 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();

            if(!input.matches("^[a-z]*$") || input.length() > 50) {
                throw new RuntimeException();
            }

            bw.write(input + "??!");
            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("아이디를 잘못 입력하셨습니다.");
        }
    }
}
