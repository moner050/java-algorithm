package programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class RetirePlayer_42576 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String result = "";
        Set<String> players = new HashSet<>();

        for (String p : participant) {
            if(!players.contains(p)) {
                players.add(p);
            }
            else {
                players.remove(p);
            }
        }

        for(String p : completion) {
            if(!players.contains(p)) {
                players.add(p);
            }
            else {
                players.remove(p);
            }
        }

        for(String answer : players) {
            result = answer;
        }

        return result;
    }
}
