import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String bowl = "";
        
        for(int i =0; i<str.length; i++){
            bowl += str[i];
        }    
        
        answer = Long.parseLong(bowl);
        
        return answer;
    }
}