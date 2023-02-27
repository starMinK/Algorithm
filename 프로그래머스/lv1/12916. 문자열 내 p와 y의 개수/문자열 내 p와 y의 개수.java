class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.substring(i, i+1).equals("p") || s.substring(i, i+1).equals("P")){
                pNum++;
            }
            if(s.substring(i, i+1).equals("y") || s.substring(i, i+1).equals("Y")){
                yNum++;
            }
        }
        
        if(yNum == pNum){
            answer = true;
        }else{
            answer = false;    
        }
        return answer;
    }
}