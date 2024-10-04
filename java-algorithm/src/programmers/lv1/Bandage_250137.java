package programmers.lv1;

public class Bandage_250137 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/250137
//      System.out.println(solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9,15}, {10, 5}, {11, 5}}));
//      System.out.println(solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}}));
        System.out.println(solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int lastTime = 0;
        int currentHealth = health;

        for (int i = 0; i < attacks.length; i++) {
            // 총 시간
            int totalTime = attacks[i][0] - lastTime -1;

            // 초당 회복
            currentHealth += totalTime * bandage[1];

            // 추가 회복량
            currentHealth += (totalTime / bandage[0]) * bandage[2];

            // 체력 계산
            currentHealth = Math.min(health, currentHealth);

            // 데미지 계산
            currentHealth -= attacks[i][1];

            // 마지막 공격 시간 저장
            lastTime = attacks[i][0];

            if(currentHealth <= 0) {
                currentHealth = -1;
                break;
            }

        }

        return currentHealth;
    }
}
