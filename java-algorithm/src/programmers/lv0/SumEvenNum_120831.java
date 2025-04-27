package programmers.lv0;

public class SumEvenNum_120831 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120831
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        SumEvenNumber sumEven = new SumEvenNumber(n);
        return sumEven.getSum();
    }
}

class SumEvenNumber {
    private int sum;

    private SumEvenNumber() {

    }

    public SumEvenNumber(int number) {
        for(int i = number; i > 0; i--) {
            if(i % 2 == 0) this.sum += i;
        }
    }

    public int getSum() {
        return this.sum;
    }
}
