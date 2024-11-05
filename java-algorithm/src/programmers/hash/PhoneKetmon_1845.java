package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneKetmon_1845 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }

    public static int solution(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        int halfSize = nums.length / 2;

        return Math.min(numMap.size(), halfSize);
    }

}
