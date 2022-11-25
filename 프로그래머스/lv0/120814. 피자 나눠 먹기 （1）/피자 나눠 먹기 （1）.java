class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = (double) n / 7;

        if(result - ((int) result) > 0){
            answer = (int) result + 1;
        }else {
            answer = (int) result;
        }
        return answer;
}
}