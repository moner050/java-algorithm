package baekjoon.lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Honeycomb_2292 {
    public static void main(String[] args) {
        // https://acmicpc.net/problem/2292

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int totalNum = 1, houseNum = 0, count = 1;

            // 1 -> 6 -> 12 -> 18 -> 24
            while(totalNum < n) {
                houseNum += 6;
                totalNum += houseNum;
                count++;
            }

            bw.write(String.valueOf(count));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
