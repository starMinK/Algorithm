import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;

        double result = Math.sqrt(n);
        if(result < Math.ceil(result)){
            answer = 2;
        }else{
            answer = 1;
        }
        
        return answer;
    }
}