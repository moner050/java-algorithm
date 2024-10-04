package programmers.lv1;

import java.util.Arrays;
import java.util.TreeSet;

public class DataAnalysis_250121 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        }, "date", 20300501, "remain")));
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // [1, 20300104, 100, 80]
        // 코드번호, 제조일, 최대수량, 현재수량
        int checkIdx = 0, sortIdx = 0, createIdx = data.length;
        TreeSet<Integer> set = new TreeSet<>();

        if(ext.equals("code")) checkIdx = 0;
        else if(ext.equals("date")) checkIdx = 1;
        else if(ext.equals("maximum")) checkIdx = 2;
        else if(ext.equals("remain")) checkIdx = 3;

        if(sort_by.equals("code")) sortIdx = 0;
        else if(sort_by.equals("date")) sortIdx = 1;
        else if(sort_by.equals("maximum")) sortIdx = 2;
        else if(sort_by.equals("remain")) sortIdx = 3;

        for(int i = 0; i < data.length; i++) {
            if(data[i][checkIdx] > val_ext) {
                data[i][0] = -1;
                createIdx--;
            }
            else {
                set.add(data[i][sortIdx]);
            }
        }

        int[][] newData = new int[createIdx][data[0].length];
        int j = 0;

        while(!set.isEmpty()) {
            int targetNum = set.pollFirst();

            for(int i = 0; i < data.length; i++) {
                if(data[i][0] == -1) {
                    continue;
                }

                if(data[i][sortIdx] == targetNum) {
                    newData[j][0] = data[i][0];
                    newData[j][1] = data[i][1];
                    newData[j][2] = data[i][2];
                    newData[j++][3] = data[i][3];
                    break;
                }
            }
        }
        return newData;
    }
}
