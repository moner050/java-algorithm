package baekjoon.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Calculation_10869 {
    public static void main(String[] args) {
        // 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] inputText = br.readLine().split(" ");

            int a = Integer.parseInt(inputText[0]);
            int b = Integer.parseInt(inputText[1]);

            String enter = "\n";
            String plus = String.valueOf(a + b);
            String minus = String.valueOf(a - b);
            String multi = String.valueOf(a * b);
            String division = String.valueOf(a / b);
            String remainder = String.valueOf(a % b);

            bw.write(plus + enter + minus + enter + multi + enter + division + enter + remainder);
            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력된 값이 옳지 않습니다.");
        }
    }
}
