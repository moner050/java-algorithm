package baekjoon.vl6;

import java.io.*;

public class GroupWordsChecker_1316 {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1316

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine()), count = 0;

            for (int i = 0; i < n; i++) {
                boolean check = true;
                boolean[] checkArr = new boolean[26];
                String input = br.readLine();

                for (int j = 0; j < input.length(); j++) {
                    int idx = input.charAt(j) - 97;

                    if(checkArr[idx] && input.charAt(j) != input.charAt(j - 1)) {
                        check = false;
                        break;
                    }
                    else {
                        checkArr[idx] = true;
                    }
                }
                if(check) count++;
            }

            bw.write(String.valueOf(count));
            bw.close();
            br.close();
        }
        catch (Exception e) {
            throw new RuntimeException("입력값이 잘못되었습니다.");
        }
    }
}
