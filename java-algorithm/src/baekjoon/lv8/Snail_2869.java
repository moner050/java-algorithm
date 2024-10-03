package baekjoon.lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Snail_2869 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2869

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int dayCount = 0;
            int[] abv = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = abv[0], b = abv[1], v = abv[2];

            dayCount = (v - b) / (a - b);
            if((v - b) % (a - b) > 0) dayCount++;

            bw.write(String.valueOf(dayCount));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
