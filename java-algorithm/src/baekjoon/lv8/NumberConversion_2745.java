package baekjoon.lv8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class NumberConversion_2745 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2745

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int total = 0;

            String[] input = br.readLine().split(" ");

            String[] n = input[0].split("");
            int b = Integer.parseInt(input[1]);

            Map<String, Integer> numTable = makeNumTable();

            for (int i = n.length - 1, num = 1; i >= 0; i--) {
                total += numTable.get(n[i]) * num;
                num *= b;
            }

            bw.write(String.valueOf(total));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

    public static Map<String, Integer> makeNumTable() {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), i);
        }

        for (int i = 65; i <= 90; i++) {
            char c = (char) ((byte) i);
            map.put(String.valueOf(c), i - 55);
        }

        return map;
    }
}
