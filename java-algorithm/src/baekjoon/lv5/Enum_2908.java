package baekjoon.lv5;

import java.io.*;

public class Enum_2908 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2908

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");

            int num1 = reverseStringToInteger(input[0]), num2 = reverseStringToInteger(input[1]);

            bw.write(String.valueOf(Math.max(num1, num2)));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

    public static int reverseStringToInteger(String param) {
        StringBuilder sb = new StringBuilder();

        for (int i = param.length() - 1; i >= 0; i--) {
            sb.append(param.charAt(i));
        }

        return Integer.parseInt(sb.toString());
    }
}
