package baekjoon.lv3;

import java.io.*;

public class Receipt_25304 {
    public static void main(String[] args) {
        /**
         https://www.acmicpc.net/problem/25304
         준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다.
         그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
         준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

         영수증에 적힌,
            구매한 각 물건의 가격과 개수
            구매한 물건들의 총 금액
         을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int x = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int calculate = 0;
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");

                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                calculate += (a * b);
            }

            if(x == calculate) {
                bw.write("Yes");
            }
            else {
                bw.write("No");
            }

            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
