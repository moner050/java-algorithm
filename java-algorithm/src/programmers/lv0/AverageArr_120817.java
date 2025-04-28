package programmers.lv0;

import java.util.Arrays;

public class AverageArr_120817 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120817
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    `}
}
