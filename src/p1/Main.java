package p1;

class Solution {
    public int solution(int n, int m) {
        int answer = 0;
        for (int i = n; i <= m; i++) {
            String num = Integer.toString(i);
            StringBuffer sb = new StringBuffer(num);
            String reverse = sb.reverse().toString();
            if (i == Integer.parseInt(reverse)) {
                answer++;
            }
        }
        return answer;
    }
}