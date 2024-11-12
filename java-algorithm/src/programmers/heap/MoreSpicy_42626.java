package programmers.heap;

import java.util.PriorityQueue;

public class MoreSpicy_42626 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        // Heap 에 스코빌 지수 복사
        PriorityQueue<Integer> scovielles = new PriorityQueue<>();

        for(int s : scoville) {
            scovielles.offer(s);
        }

        int mix = 0, cnt = 0;

        while(scovielles.peek() < K) {
            if(scovielles.size() < 2) {
                return -1;
            }
            int first = scovielles.poll();
            int second = scovielles.poll();
            mix = first + (second * 2);
            scovielles.offer(mix);
            cnt++;
        }

        return cnt;
    }
}
