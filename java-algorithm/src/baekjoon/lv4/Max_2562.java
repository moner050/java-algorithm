package baekjoon.lv4;

import java.io.*;

public class Max_2562 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2562

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[] input = new int[9];
            int maxNum = 0, maxIdx = 0;

            for (int i = 0; i < 9; i++) {
                input[i] = Integer.parseInt(br.readLine());

                if(maxNum < input[i]) {
                    maxIdx = i+1;
                    maxNum = input[i];
                }
            }

            bw.write(maxNum + "\n" + maxIdx);
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
