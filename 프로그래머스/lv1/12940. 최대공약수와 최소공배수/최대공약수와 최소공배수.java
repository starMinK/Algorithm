class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1,1};
        
        int max = 0;
        int min = 0;
        if (n > m){
            max = n;
            min = m;
        }else{
            max = m;
            min = n;
        }
        
        // 최대공약수
        while (min != 0){
            int r = max % min;
            max = min;
            min = r;
        }
        
        // 최소공배수
        answer[0] = max;
        answer[1] = n * m / max;
            
        return answer;
        
    }
}