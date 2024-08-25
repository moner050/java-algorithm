package baekjoon.lv5;

import java.io.*;
import java.util.StringTokenizer;

public class CountWords_1152 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/1152

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            bw.write(String.valueOf(st.countTokens()));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
