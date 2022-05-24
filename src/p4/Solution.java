package p4;

public class Solution {
    public static int nextNum(int n) {
        if (n % 2 == 1) {
            n = (n + 1) / 2;
        } else {
            n = n/2 ;
        }
        return n;
    }

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            if (Math.abs(a - b) == 1 && Math.min(a, b) % 2 == 1) {
                answer++;
                break;
            }
            a = nextNum(a);
            b = nextNum(b);
        }
        return answer;
    }
}
