package baekjoon.lv6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class YourAverage_25206 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/25206

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            double sum = 0.0, totalSum = 0.0, majorAverage = 0.0;
            Map<String, Double> map = new HashMap<>();
            map.put("A+", 4.5);
            map.put("A0", 4.0);
            map.put("B+", 3.5);
            map.put("B0", 3.0);
            map.put("C+", 2.5);
            map.put("C0", 2.0);
            map.put("D+", 1.5);
            map.put("D0", 1.0);
            map.put("F", 0.0);

            for (int i = 0; i < 20; i++) {
                String[] input = br.readLine().split(" ");

                if(input[2].equals("P")) {
                    continue;
                }

                double unit = Double.parseDouble(input[1]);

                totalSum += unit;
                sum += (unit * map.get(input[2]));
            }

            majorAverage = sum / totalSum;

            bw.write(String.valueOf(majorAverage));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
