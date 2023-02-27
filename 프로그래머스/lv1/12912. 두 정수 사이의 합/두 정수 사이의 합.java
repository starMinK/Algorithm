class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int bigInt = 0;
        int smallInt = 0;
        
        /*
        if(a >= b){
            bigInt = a;
            smallInt = b;
        }else {
            bigInt = b;
            smallInt = a;
        }
        
        for(int i = smallInt; i <= bigInt; i++){
            answer += i;
        }*/
        
        if(a <= b){
            for(int i = a; i <= b; i++){
            answer += i;
            }   
        }else {
            for(int i = b; i <= a; i++){
            answer += i;
            }
        }
        
        
        return answer;
    }
}