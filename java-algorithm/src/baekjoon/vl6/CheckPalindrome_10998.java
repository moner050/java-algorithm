package baekjoon.vl6;

import java.io.*;

public class CheckPalindrome_10998 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10988

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String word = br.readLine();
            String reverseWord = reverseString(word);

            bw.write(word.equals(reverseWord) ? "1" : "0");
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

    public static String reverseString(String param) {
        StringBuilder sb = new StringBuilder();
        for (int i = param.length() - 1; i >= 0; i--) {
            sb.append(param.charAt(i));
        }
        return sb.toString();
    }
}
