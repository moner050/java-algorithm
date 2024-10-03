package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Gift_258712 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/258712

        System.out.println(solution(new String[]{"muzi", "ryan", "frodo", "neo"},
                new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
    }

    public static int solution(String[] friends, String[] gifts) {
        List<String> friendsList = new ArrayList<>();
        int[][] giftTable = new int[friends.length][friends.length + 2];
        int max = 0;

        // 친구 리스트 복사
        for(String friend : friends) {
            friendsList.add(friend);
        }

        // 선물 주고 받은 데이터 넣어주기
        for(String gift : gifts) {
            String[] names = gift.split(" ");
            String giveName = names[0], gettingName = names[1];
            int giveIdx = friendsList.indexOf(giveName), gettingIdx = friendsList.indexOf(gettingName);

            giftTable[giveIdx][gettingIdx]++;
        }

        // 선물지수 계산하기
        for(int i = 0; i < giftTable.length; i++) {
            int give = 0, get = 0;

            // 받은 선물 및 준 선물 지수 계산
            for(int j = 0; j < giftTable[i].length - 2; j++) {
                give += giftTable[i][j];
                get += giftTable[j][i];
            }

            giftTable[i][giftTable[i].length - 2] = give - get;
        }

        // 받을 선물 개수 계산
        for(int i = 0; i < giftTable.length; i++) {
            for(int j = 0; j < giftTable[i].length - 2; j++) {
                if(i == j) continue;

                if(giftTable[i][j] > giftTable[j][i]) {
                    giftTable[i][giftTable[i].length - 1]++;
                }
                else if(giftTable[i][j] == giftTable[j][i]) {
                    if(giftTable[i][giftTable[i].length - 2] > giftTable[j][giftTable[i].length - 2]) {
                        giftTable[i][giftTable[i].length - 1]++;
                    }
                }
            }
        }

        // 선물이 가장 많은 사람의 선물 개수 찾아 리턴
        for(int i = 0; i < giftTable.length; i++) {
            if(giftTable[i][giftTable[i].length - 1] > max) {
                max = giftTable[i][giftTable[i].length - 1];
            }
        }

        return max;
    }
}
