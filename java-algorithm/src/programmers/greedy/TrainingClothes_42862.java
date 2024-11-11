package programmers.greedy;

import java.util.*;

public class TrainingClothes_42862 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;

        // 도난학생 및 여벌학생 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌인데 도난당한 학생 저장용 Set
        Set<Integer> set = new HashSet<>();
        // 도난학생 저장용 Queue
        Queue<Integer> queue = new LinkedList<>();

        for (int l : lost) {
            for (int r : reserve) {
                if(l == r) {
                    set.add(r);
                    break;
                }
            }
            queue.offer(l);
        }

        for (int r : reserve) {
            // 여벌인데 도난당한 학생이면 패스
            if(set.contains(r)) continue;

            // 도난학생이 여벌학생 idx 보다 작거나, 중복되면 데이터 삭제
            while(!queue.isEmpty() && (queue.peek() < r - 1 || set.contains(queue.peek()))) {
                queue.poll();
            }

            // 큐에 데이터가 존재하며 도난당한 학생이 여벌학생의 범위에 있으면 빌려줌
            if(!queue.isEmpty() && queue.peek() <= r + 1) {
                queue.poll();
                cnt++;
            }
        }

        return n - lost.length + set.size() + cnt;
    }
}
