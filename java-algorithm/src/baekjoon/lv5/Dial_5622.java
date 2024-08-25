package baekjoon.lv5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Dial_5622 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/5622

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split("");
            int count = 0, time = 3, result = 0;

            Map<String, Integer> map = new HashMap<>();
            for (int i = 65; i <= 90; i++, count++) {
                String alphabet = String.valueOf(((char) i));

                if(alphabet.equals("R") || alphabet.equals("Y")) {
                    count--;
                }

                if(count == 3) {
                    count = 0;
                    time++;
                }

                map.put(alphabet, time);
            }

            for (String str : input) {
                result += map.getOrDefault(str, 0);
            }

            bw.write(String.valueOf(result));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
