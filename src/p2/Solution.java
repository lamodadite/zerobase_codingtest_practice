package p2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Solution {
    public List solution(int []arr) {
        List answer = new ArrayList();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}