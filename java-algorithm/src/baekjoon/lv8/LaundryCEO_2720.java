package baekjoon.lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LaundryCEO_2720 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2720

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                int c = Integer.parseInt(br.readLine());
                int q = c / 25, d = (c % 25) / 10, n = ((c % 25) % 10) / 5, p = (((c % 25) % 10) % 5);

                bw.write(q + " " + d + " " + n + " " + p + "\n");
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
