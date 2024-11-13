package programmers.exhaustive_search;

public class MinRectangle_86491 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    public static int solution(int[][] sizes) {
        int maxW = Integer.MIN_VALUE, maxH = Integer.MIN_VALUE;

        for(int[] size : sizes) {
            maxW = Math.max(maxW, Math.max(size[0], size[1]));
            maxH = Math.max(maxH, Math.min(size[0], size[1]));
        }

        return maxW * maxH;
    }
}
