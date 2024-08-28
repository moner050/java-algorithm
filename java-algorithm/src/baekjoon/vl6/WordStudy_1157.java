package baekjoon.vl6;

import java.io.*;

public class WordStudy_1157 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1157

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int max = -1;
            char c = '?';
            int[] count = new int[26];
            char[] words = br.readLine().toUpperCase().toCharArray();

            for (char word : words) {
                String idx = String.valueOf((byte) word);
                count[Integer.parseInt(idx) - 65]++;
            }

            for (int i = 0; i < count.length; i++) {
                if(count[i] > max) {
                    max = count[i];
                    c = (char) (i + 65);
                }
                else if(count[i] == max) {
                    c = '?';
                }
            }

            bw.write(String.valueOf(c));

            bw.close();
            br.close();

        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
