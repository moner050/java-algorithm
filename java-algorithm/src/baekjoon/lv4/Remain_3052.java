package baekjoon.lv4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Remain_3052 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/3052

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < 10; i++) {
                int number = Integer.parseInt(br.readLine());
                set.add(number % 42);
            }

            bw.write(String.valueOf(set.size()));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
