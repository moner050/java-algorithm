package baekjoon.lv3;

import java.io.*;

public class Star_2439 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2439
        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        // 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());

            if(n < 1 || n > 100) {
                throw new RuntimeException();
            }

            String star = "*", blank = " ";
            for (int i = 1; i <= n; i++) {
                bw.write(blank.repeat(n - i) + star.repeat(i) + "\n");
            }
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
