package baekjoon.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AB_1008 {
    public static void main(String[] args) {
        // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] inputText = br.readLine().split(" ");

            double a = Double.parseDouble(inputText[0]);
            double b = Double.parseDouble(inputText[1]);

            double result = a / b;

            bw.write(String.valueOf(result));
            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력된 값이 옳지 않습니다.");
        }
    }
}
