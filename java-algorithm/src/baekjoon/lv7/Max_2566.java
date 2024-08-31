package baekjoon.lv7;

import java.io.*;
import java.util.Arrays;

public class Max_2566 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2566

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int max = 0, idx1 = 1, idx2 = 1;
            int[][] arr = new int[9][9];

            for (int i = 0; i < arr.length; i++) {
                int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = nums[j];
                    if(nums[j] > max) {
                        max = nums[j];
                        idx1 = i + 1;
                        idx2 = j + 1;
                    }
                }
            }
            bw.write(max + "\n" + idx1 + " " + idx2);
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
