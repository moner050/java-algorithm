package baekjoon.lv5;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FindAlphabet_10809 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10809

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split("");
            List<String> list = Arrays.asList(input);

            for (int i = 97; i <= 122; i++) {
                String word = String.valueOf((char) i);

                if(list.contains(word)) {
                    bw.write(list.indexOf(word) + " ");
                }
                else {
                    bw.write("-1 ");
                }
            }

            bw.close();
            br.close();

        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }

}
