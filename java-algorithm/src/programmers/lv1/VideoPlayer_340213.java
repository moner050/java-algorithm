package programmers.lv1;

public class VideoPlayer_340213 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/340213

        System.out.println(solution("07:22", 	"04:05", "00:15", "04:07", new String[]{"next"}));
//      System.out.println(solution("30:00", 	"15:00", "15:10", "15:30", new String[]{"next","next"}));
        System.out.println(solution("10:55", 	"00:05", "00:15", "06:55", new String[]{"prev","next","next"}));
//      System.out.println(solution("34:33", 	"09:50", "10:00", "13:00", new String[]{"next","next","next","prev"}));
//      System.out.println(solution("30:00", 	"30:00", "00:00", "00:05", new String[]{"next","prev"}));
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int fullMin = Integer.parseInt(video_len.split(":")[0]), fullSec = Integer.parseInt(video_len.split(":")[1]);
        int posMin = Integer.parseInt(pos.split(":")[0]), posSec = Integer.parseInt(pos.split(":")[1]);
        int opsMin = Integer.parseInt(op_start.split(":")[0]), opsSec = Integer.parseInt(op_start.split(":")[1]);
        int opeMin = Integer.parseInt(op_end.split(":")[0]), opeSec = Integer.parseInt(op_end.split(":")[1]);

        // 시작 오프닝 체크
        int[] tempTime = openingCheck(posMin, posSec, opsMin, opsSec, opeMin, opeSec);
        posMin = tempTime[0];
        posSec = tempTime[1];

        for(String command : commands) {
            if(command.equals("next")) {
                tempTime = timeCalculate(posMin, posSec, 0, 10);
                posMin = tempTime[0];
                posSec = tempTime[1];
            }
            else if(command.equals("prev")) {
                tempTime = timeCalculate(posMin, posSec, 0, -10);
                posMin = tempTime[0];
                posSec = tempTime[1];
            }
            // 오프닝 체크
            tempTime = openingCheck(posMin, posSec, opsMin, opsSec, opeMin, opeSec);
            posMin = tempTime[0];
            posSec = tempTime[1];

            // 비디오 전체 길이 체크
            tempTime = videoLengthCheck(posMin, posSec, fullMin, fullSec);
            posMin = tempTime[0];
            posSec = tempTime[1];
        }

        String answer = timeToString(posMin, posSec);
        return answer;
    }

    public static int[] timeCalculate(int beforeMin, int beforeSec, int addMin, int addSec) {
        int[] minSec = new int[2];
        int tempMin = beforeMin + addMin;
        int tempSec = beforeSec + addSec;

        if(tempSec >= 60) {
            tempMin += 1;
            tempSec -= 60;
        }
        else if(tempSec < 0 && tempMin > 0) {
            tempMin -= 1;
            tempSec += 60;
        }

        if(tempMin < 0) {
            tempMin = 0;
        }

        if(tempSec < 0) {
            tempSec = 0;
        }

        minSec[0] = tempMin;
        minSec[1] = tempSec;
        return minSec;
    }

    public static String timeToString(int min, int sec) {
        StringBuilder sb = new StringBuilder();
        if(min < 10) {
            sb.append("0");
        }

        sb.append(min);
        sb.append(":");

        if(sec < 10) {
            sb.append("0");
        }

        sb.append(sec);

        return sb.toString();
    }

    public static int[] openingCheck(int beforeMin, int beforeSec, int opsMin, int opsSec, int opeMin, int opeSec) {
        int[] minSec = new int[2];
        int beforeTime = Integer.parseInt(timeToString(beforeMin, beforeSec).replace(":", ""));
        int opsTime = Integer.parseInt(timeToString(opsMin, opsSec).replace(":", ""));
        int opeTime = Integer.parseInt(timeToString(opeMin, opeSec).replace(":", ""));

        if(beforeTime >= opsTime && beforeTime <= opeTime) {
            minSec[0] = opeMin;
            minSec[1] = opeSec;
        }
        else {
            minSec[0] = beforeMin;
            minSec[1] = beforeSec;
        }

        return minSec;
    }

    public static int[] videoLengthCheck(int beforeMin, int beforeSec, int fullMin, int fullSec) {
        int[] minSec = new int[2];
        int beforeTime = Integer.parseInt(timeToString(beforeMin, beforeSec).replace(":", ""));
        int fullTime = Integer.parseInt(timeToString(fullMin, fullSec).replace(":", ""));

        if(beforeTime >= fullTime) {
            minSec[0] = fullMin;
            minSec[1] = fullSec;
        }
        else {
            minSec[0] = beforeMin;
            minSec[1] = beforeSec;
        }

        return minSec;
    }
}
