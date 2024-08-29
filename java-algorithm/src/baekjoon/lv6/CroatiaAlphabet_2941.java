package baekjoon.lv6;

import java.io.*;

public class CroatiaAlphabet_2941 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2941

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] croatiaWords = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            String input = br.readLine();

            for (int i = 0; i < croatiaWords.length; i++) {
                input = input.replaceAll(croatiaWords[i], String.valueOf(i));
            }

            bw.write(String.valueOf(input.length()));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
