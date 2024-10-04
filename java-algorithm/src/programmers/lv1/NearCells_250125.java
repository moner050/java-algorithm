package programmers.lv1;

public class NearCells_250125 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/250125

        System.out.println(solution(new String[][]{
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}}, 1, 1));
    }

    public static int solution(String[][] board, int h, int w) {
        String target = board[h][w];
        int count = 0;

        if(h > 0) {
            if(board[h-1][w].equals(target)) count++;
        }
        if(board.length - 1 > h) {
            if(board[h+1][w].equals(target)) count++;
        }
        if(board[0].length - 1 > w) {
            if(board[h][w+1].equals(target)) count++;
        }
        if(w > 0) {
            if(board[h][w-1].equals(target)) count++;
        }

        return count;
    }
}
