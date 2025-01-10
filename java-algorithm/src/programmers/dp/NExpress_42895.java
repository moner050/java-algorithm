package programmers.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NExpress_42895 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42895
    public static void main(String[] args) {
        System.out.println(solution(5, 12));
    }

    public static int solution(int N, int number) {
        List<Set<Integer>> dp = new ArrayList<Set<Integer>>();

        if(N == number) return 1;

        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }

        for (int i = 1; i <= 8; i++) {
            int repeatN = Integer.parseInt(String.valueOf(N).repeat(i));
            dp.get(i).add(repeatN);

            for (int j = 1; j < i; j++) {
                for (int r : dp.get(j)) {
                    for (int l : dp.get(i - j)) {
                        // 사칙연산 값 넣어주기
                        dp.get(i).add(r + l);
                        dp.get(i).add(r - l);
                        dp.get(i).add(l - r);
                        dp.get(i).add(r * l);

                        if(r != 0) dp.get(i).add(l / r);
                        if(l != 0) dp.get(i).add(r / l);
                    }
                }
            }

            if(dp.get(i).contains(number)) return i;
        }

        return -1;
    }
}
