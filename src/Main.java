
class Main {
    public static void main(String[] args) {
        int answer = 0;

        for (int i = 1; i <= 100; i++) {
            String num = Integer.toString(i);
            StringBuffer sb = new StringBuffer(num);
            String reverse = sb.reverse().toString();
            if (i == Integer.parseInt(reverse)) {
                answer++;
            }
        }
    }
}