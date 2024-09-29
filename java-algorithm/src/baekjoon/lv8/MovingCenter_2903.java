package baekjoon.lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MovingCenter_2903 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2903

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int topPoint = 2, count = 1;
            int n = Integer.parseInt(br.readLine());
            // 2 -> 3 -> 5 -> 9 -> 17 -> 33
            // 0    1    2    4    8     16

            for (int i = 1; i <= n; i++) {
                if(i > 1) count *= 2;
                topPoint += count;
            }

            bw.write(String.valueOf(topPoint * topPoint));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
