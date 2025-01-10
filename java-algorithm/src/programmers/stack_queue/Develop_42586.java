package programmers.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class Develop_42586 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        int currCount = 0, version = 0;

        for(int i = 0; i < progresses.length; i++) {
            // 작업일 계산
            int afterCount = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] > 0) {
                afterCount++;
            }

            if(afterCount > currCount) {
                if(version > 0) {
                    stack.push(version);
                }
                currCount = afterCount;
                version = 1;
            }
            else {
                version++;
            }
        }

        if(version > 0) {
            stack.push(version);
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

}
