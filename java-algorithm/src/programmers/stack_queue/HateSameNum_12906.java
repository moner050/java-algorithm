package programmers.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class HateSameNum_12906 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12906
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));
    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if(stack.isEmpty()) {
                stack.push(num);
            }

            if(stack.peek() != num) {
                stack.push(num);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
