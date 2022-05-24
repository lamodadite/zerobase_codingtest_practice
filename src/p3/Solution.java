package p3;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);

        for (String item : num.split("")) {
            answer += Integer.parseInt(item);
        }
        return answer;
    }
}
