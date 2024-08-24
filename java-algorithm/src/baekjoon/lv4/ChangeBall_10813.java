package baekjoon.lv4;

import java.io.*;
import java.util.Arrays;

public class ChangeBall_10813 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10813

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = nm[0], m = nm[1];

            int[] basket = makeBasket(n);

            for (int l = 0; l < m; l++) {
                int[] trade = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int i = trade[0] - 1, j = trade[1] - 1;

                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
            }

            bw.write(arrayToString(basket));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

    public static int[] makeBasket(int n) {
        int[] basket = new int[n];
        for (int i = 1; i <= n; i++) {
            basket[i-1] = i;
        }
        return basket;
    }
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if(i != array.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
