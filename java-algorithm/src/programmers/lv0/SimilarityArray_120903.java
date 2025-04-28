package programmers.lv0;

import java.util.Arrays;
import java.util.List;

public class SimilarityArray_120903 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120903
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"}));
    }

    public static int solution(String[] s1, String[] s2) {
        List<String> s2List = Arrays.asList(s2);
        int count = 0;

        for(String s : s1) {
            if(s2List.contains(s)) count++;
        }

        return count;
    }


}
