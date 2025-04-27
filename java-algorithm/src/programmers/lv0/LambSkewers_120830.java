package programmers.lv0;

public class LambSkewers_120830 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120830
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
    }

    public static int solution(int n, int k) {
        LambSkewers lambSkewers = new LambSkewers(n, k);
        return lambSkewers.getPrice();
    }
}

class LambSkewers {
    private int price;

    private LambSkewers() {

    }

    public LambSkewers(int lambCount, int drinkCount) {
        this.price = (12000 * lambCount) + (2000 * (drinkCount - (lambCount / 10)));
    }

    public int getPrice() {
        return this.price;
    }
}