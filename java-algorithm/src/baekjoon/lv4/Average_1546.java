package baekjoon.lv4;

import java.io.*;
import java.util.Arrays;

public class Average_1546 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1546

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int num = Integer.parseInt(br.readLine());

            double[] scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double maxScore = Arrays.stream(scores).max().orElseThrow(() -> new RuntimeException("배열이 비어있습니다."));

            for (int i = 0; i < scores.length; i++) {
                scores[i] = (scores[i]/maxScore)*100;
            }

            double average = Arrays.stream(scores).average().orElseThrow(() -> new RuntimeException("배열이 비어있습니다."));

            bw.write(String.valueOf(average));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
