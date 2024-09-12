package baekjoon.lv8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NumberConversion_11005 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/11005

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
            Stack<Integer> stack = new Stack<>();

            Map<Integer, String> numMap = makeNumMap();

            while(n != 0) {
                if(n / b == 0) {
                    stack.push(n);
                    break;
                }
                else {
                    stack.push(n % b);
                    n /= b;
                }
            }

            while(!stack.isEmpty()) {
                bw.write(numMap.get(stack.pop()));
            }

            bw.close();
            br.close();

        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

    public static Map<Integer, String> makeNumMap() {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, String.valueOf(i));
        }

        for (int i = 65; i <= 90; i++) {
            String s = String.valueOf((char) ((byte) i));
            map.put(i - 55, s);
        }

        return map;
    }
}
