package baekjoon.lv4;

import java.io.*;
import java.util.*;

public class Count_10807 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10807
        // 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int findKey = Integer.parseInt(br.readLine());

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(input[i], map.getOrDefault(input[i], 0) + 1);
            }

            bw.write(String.valueOf(map.getOrDefault(findKey, 0)));
            bw.close();
            br.close();

        } catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
