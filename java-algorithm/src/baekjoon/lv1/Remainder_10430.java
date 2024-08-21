package baekjoon.lv1;

import java.io.*;

public class Remainder_10430 {
    public static void main(String[] args) {
        /**
         (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
         (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
         세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");

            if(input.length < 3) {
                throw new RuntimeException();
            }

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            String enter = "\n";
            String rst1 = String.valueOf((a+b)%c);
            String rst2 = String.valueOf(((a%c)+(b%c))%c);
            String rst3 = String.valueOf((a*b)%c);
            String rst4 = String.valueOf(((a%c)*(b%c))%c);

            bw.write(rst1 + enter + rst2 + enter + rst3 + enter + rst4);
            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("잘못 입력되었습니다.");
        }
    }
}
