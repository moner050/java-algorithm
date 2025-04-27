package programmers.lv0;

import java.util.Arrays;

public class ArrayElementLength_120854 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120854
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
