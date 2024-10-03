package programmers.lv1;

import java.util.Set;
import java.util.HashSet;

public class Park_340198 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 3, 2}, new String[][]{
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        }));
    }
    public static int solution(int[] mats, String[][] park) {
        int[][] dp = new int[park.length][park[0].length];
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length; j++) {
                if(park[i][j].equals("-1")) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < park.length; i++) {
            for(int j = 1; j < park[i].length; j++) {
                if(dp[i][j] == 0) continue;

                dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                set.add(dp[i][j]);
            }
        }

        int max = -1;

        for(int mat : mats) {
            if(set.contains(mat)) {
                max = Math.max(mat, max);
            }
        }

        return max;
    }
}
