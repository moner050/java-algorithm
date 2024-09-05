package baekjoon.lv7;

import java.io.*;
import java.util.Arrays;

public class Confetti_2563 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2563

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[][] paper = new int[100][100];
            int count = Integer.parseInt(br.readLine()), extent = 0;

            for (int i = 0; i < count; i++) {
                int[] confetti = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int width = confetti[0], length = confetti[1];

                for (int j = length; j < length + 10; j++) {
                    for (int k = width; k < width + 10; k++) {
                        if(paper[j][k] == 0) {
                            extent++;
                        }
                        paper[j][k] = 1;
                    }
                }
            }

            bw.write(String.valueOf(extent));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
