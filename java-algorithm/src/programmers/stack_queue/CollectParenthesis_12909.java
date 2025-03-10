package programmers.stack_queue;

import java.util.Stack;

public class CollectParenthesis_12909 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for(char c : charArray) {
            if(stack.isEmpty() && c == ')') return false;

            if(!stack.isEmpty()) {
                if(stack.peek() == '(' && c == ')') {
                    stack.pop();
                }
                else stack.push(c);
            }
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
