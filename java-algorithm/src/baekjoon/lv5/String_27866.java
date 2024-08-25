package baekjoon.lv5;

import java.io.*;

public class String_27866 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/27866

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String s = br.readLine();
            int idx = Integer.parseInt(br.readLine()) - 1;

            bw.write(s.charAt(idx));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
