class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum++;
            if(sum%2==0){
                answer+=sum;
            }
        }
        return answer;
    }
}