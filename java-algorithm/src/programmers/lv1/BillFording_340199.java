package programmers.lv1;

public class BillFording_340199 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/340199
        System.out.println(solution(new int[]{30, 15}, new int[]{26, 17}));
        System.out.println(solution(new int[]{50, 50}, new int[]{100, 241}));
    }
    public static int solution(int[] wallet, int[] bill) {
        int walletMax = Math.max(wallet[0], wallet[1]), walletMin = Math.min(wallet[0], wallet[1]);
        int billMax = Math.max(bill[0], bill[1]), billMin = Math.min(bill[0], bill[1]);

        int answer = 0, temp = 0;

        while(true) {
            if(walletMax >= billMax && walletMin >= billMin) {
                break;
            }
            else {
                temp = billMax / 2;
                billMax = Math.max(temp, billMin);
                billMin = Math.min(temp, billMin);
            }
            answer++;
        }

        return answer;
    }
}
