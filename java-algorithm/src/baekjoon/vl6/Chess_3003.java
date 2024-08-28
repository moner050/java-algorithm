package baekjoon.vl6;

import java.io.*;
import java.util.Arrays;

public class Chess_3003 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/3003

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[] chessOriginal = new int[] {1, 1, 2, 2, 2, 8};
            int[] inputChess = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < chessOriginal.length; i++) {
                bw.write((chessOriginal[i] - inputChess[i]) + " ");
            }

            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
