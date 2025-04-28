package programmers.lv0;

public class StringInString_120908 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120908
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }
    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
