package programmers.lv0;

public class Division_120806 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120806
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
    }

    public static int solution(int num1, int num2) {
        double doubleRst = ((double)num1 / (double)num2) * 1000;
        String strResult = String.valueOf(doubleRst);

        int idx = strResult.indexOf(".");
        return Integer.parseInt(strResult.substring(0, idx));
    }
}
