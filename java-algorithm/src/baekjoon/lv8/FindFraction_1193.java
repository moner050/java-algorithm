package baekjoon.lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindFraction_1193 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1193

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            boolean leftFlag = false, rightFlag = false;
            int firstNum = 1, lastNum = 1;
            int x = Integer.parseInt(br.readLine());

            for (int i = 2; i <= x; i++) {
                if(firstNum == 1 && lastNum % 2 == 1) {
                    lastNum++;
                    continue;
                }
                else if(firstNum == 1 && lastNum % 2 == 0) {
                    leftFlag = true;
                    rightFlag = false;
                }
                else if(lastNum == 1 && firstNum % 2 == 0) {
                    firstNum++;
                    continue;
                }
                else if(lastNum == 1 && firstNum % 2 == 1) {
                    leftFlag = false;
                    rightFlag = true;
                }

                if(leftFlag && !rightFlag) {
                    firstNum++;
                    lastNum--;
                }

                if(!leftFlag && rightFlag) {
                    firstNum--;
                    lastNum++;
                }
            }

            bw.write(firstNum + "/" + lastNum);
            bw.close();
            br.close();

        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
