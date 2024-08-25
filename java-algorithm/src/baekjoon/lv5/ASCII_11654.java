package baekjoon.lv5;

import java.io.*;

public class ASCII_11654 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            byte asc = (byte) br.readLine().charAt(0);
            bw.write(String.valueOf(asc));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
