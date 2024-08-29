package baekjoon.lv6;

import java.io.*;

public class Sprout_25083 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/25083

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("         ,r'\"7\n"+
                    "r`-_   ,'  ,/\n" +
                    " \\. \". L_r'\n" +
                    "   `~\\/\n" +
                    "      |\n" +
                    "      |"
            );

            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
