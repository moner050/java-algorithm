package baekjoon.lv5;

import java.io.*;

public class WordLength_2743 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2743

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String word = br.readLine();

            bw.write(String.valueOf(word.length()));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
