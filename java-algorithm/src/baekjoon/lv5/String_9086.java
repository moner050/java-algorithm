package baekjoon.lv5;

import java.io.*;

public class String_9086 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                String word = br.readLine();

                String first = String.valueOf(word.charAt(0)), last = String.valueOf(word.charAt(word.length()-1));

                bw.write(first + last + "\n");
                bw.flush();
            }

            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
