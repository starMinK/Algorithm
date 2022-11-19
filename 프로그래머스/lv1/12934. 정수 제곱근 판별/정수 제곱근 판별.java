class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt((double) n);

        if(result - (int) result == 0) {
            answer = (long) Math.pow(result + 1, 2);
        }else {
            answer = -1;
        }

        return answer;
    }
}