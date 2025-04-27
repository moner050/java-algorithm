package programmers.lv0;

public class Protractor_120829 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120829
    public static void main(String[] args) {
        System.out.println(solution(70));
    }

    public static int solution(int angle) {
        Angle angleObj = new Angle(angle);
        return angleObj.getAngle();
    }
}

class Angle {
    int angle;

    private Angle() {

    }

    public Angle(int angle) {
        if(angle >= 0 && angle < 90) {
            this.angle = 1;
        }
        else if(angle == 90) {
            this.angle = 2;
        }
        else if(angle > 90 && angle < 180) {
            this.angle = 3;
        }
        else {
            this.angle = 4;
        }
    }

    public int getAngle() {
        return this.angle;
    }
}
