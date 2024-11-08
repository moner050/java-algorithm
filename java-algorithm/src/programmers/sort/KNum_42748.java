package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KNum_42748 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42748
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},{4, 4, 1},{1, 7, 3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++) {
            int i = commands[l][0], j = commands[l][1], k = commands[l][2];

            List<Integer> temp = new ArrayList<>();

            for (int m = i; m <= j; m++) {
                temp.add(array[m - 1]);
            }

            Collections.sort(temp);

            answer[l] = temp.get(k - 1);
        }

        return answer;
    }
}
