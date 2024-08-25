package baekjoon.lv5;

import java.io.*;

public class PrintOriginal_11718 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/11718

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = "";
            while((input = br.readLine()) != null) {
                bw.write(input + "\n");
            }

            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
