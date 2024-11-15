package programmers.exhaustive_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam_42840 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }

    public static int[] solution(int[] answers) {
        int[] a = new int[] {1,2,3,4,5};
        int[] b = new int[] {2,1,2,3,2,4,2,5};
        int[] c = new int[] {3,3,1,1,2,2,4,4,5,5};
        int[] scores = new int[] {0, 0, 0};

        for(int i = 0; i < answers.length; i++) {
            if(a[i % a.length] == answers[i]) scores[0]++;
            if(b[i % b.length] == answers[i]) scores[1]++;
            if(c[i % c.length] == answers[i]) scores[2]++;
        }

        List<Integer> scoreIdx = new ArrayList<>();
        int maxValue = Arrays.stream(scores).max().getAsInt();

        for(int i = 0; i < scores.length; i++) {
            if(maxValue != 0 && maxValue == scores[i]) {
                scoreIdx.add(i + 1);
            }
        }

        return scoreIdx.stream().mapToInt(Integer::intValue).toArray();
    }
}
