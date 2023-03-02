class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6){
            answer = true;
        }else{
            answer = false;
        }
        
        for (int i = 0; i < s.length(); i++){
            if( s.charAt(i) > '9' ){
                return false;
            }
        }
        return answer;
    }
}