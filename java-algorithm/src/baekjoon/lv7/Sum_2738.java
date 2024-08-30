package baekjoon.lv7;

import java.io.*;
import java.util.Arrays;

public class Sum_2738 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2738
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = nm[0], m = nm[1];

            int[][] a = new int[n][m], b = new int[n][m];

            a = makeArr(a);
            b = makeArr(b);
            int[][] result = sumArr(a, b);

            bw.write(arrToString(result));
            bw.close();
            br.close();

        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

    public static int[][] makeArr(int[][] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.arraycopy(numbers, 0, arr[i], 0, arr[i].length);
        }
        return arr;
    }

    public static int[][] sumArr(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] += b[i][j];
            }
        }
        return a;
    }

    public static String arrToString(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
