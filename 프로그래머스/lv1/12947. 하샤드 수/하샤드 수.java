class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;

        while(x != 0) {
            sum += x%10;
            x /= 10;
        }
        
        if (a % (double) sum == 0) answer = true;
        else answer = false;
        
        return answer;
    }
}