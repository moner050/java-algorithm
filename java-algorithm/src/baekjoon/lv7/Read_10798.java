package baekjoon.lv7;

import java.io.*;

public class Read_10798 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10798

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] temp = new String[5];
            int maxLength = 0;
            for (int i = 0; i < 5; i++) {
                temp[i] = br.readLine();
                if(temp[i].length() > maxLength) maxLength = temp[i].length();
            }

            for (int i = 0; i < maxLength; i++) {
                for (int j = 0; j < 5; j++) {
                    if(temp[j].length() > i) {
                        bw.write(temp[j].charAt(i));
                    }
                }
            }

            bw.close();
            br.close();

        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
