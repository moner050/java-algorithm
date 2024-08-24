package baekjoon.lv4;

import java.io.*;

public class Report_5597 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/5597

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int min = 100, max = 0;
            boolean[] check = new boolean[30];

            for (int i = 0; i < 28; i++) {
                int num = Integer.parseInt(br.readLine());
                check[num - 1] = true;
            }

            for (int i = 0; i < check.length; i++) {
                if(!check[i]) {
                    if((i+1) > max) {
                        max = i + 1;
                    }
                    if((i+1) < min) {
                        min = i + 1;
                    }
                }
            }

            bw.write(min + "\n" + max);
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
