package baekjoon.lv5;

import java.io.*;

public class RepeatString_2675 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/2675

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                String[] input = br.readLine().split(" ");
                int r = Integer.parseInt(input[0]);
                String[] words = input[1].split("");

                for(String word : words) {
                    bw.write(word.repeat(r));
                }

                bw.write("\n");
            }

            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
