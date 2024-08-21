package baekjoon.lv1;

import java.io.*;

public class Year_18108 {
    public static void main(String[] args) {
        /**
         CPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
         공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
         불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
         반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int year = Integer.parseInt(br.readLine());

            if(year <= 1000 || year >= 3000) {
                throw new RuntimeException();
            }

            String newYear = String.valueOf(year - 543);

            bw.write(newYear);
            bw.close();
        }
        catch (Exception e) {
            throw new RuntimeException("연도를 잘못 입력하셨습니다.");
        }
    }
}
