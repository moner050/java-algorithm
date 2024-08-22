package baekjoon.lv3;

import java.io.*;

public class Coding_25314 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/25314

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < (n/4); i++) {
                bw.write("long ");
            }

            bw.write("int");
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
