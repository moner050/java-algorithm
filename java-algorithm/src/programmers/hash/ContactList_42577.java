package programmers.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContactList_42577 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42577
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
    }

    public static boolean solution(String[] phone_book) {
        Set<String> phone = new HashSet<>(Arrays.asList(phone_book));

        for(String next : phone_book){
            StringBuilder sb = new StringBuilder();
            char [] arr = next.toCharArray();

            for(int i = 0; i < arr.length - 1; i++){
                sb.append(arr[i]);
                if(phone.contains(sb.toString())) return false;
            }
            sb.setLength(0);
        }
        return true;
    }
}
