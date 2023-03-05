import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            answer += d[i];
            count = i;
            
            if(answer > budget){
                break;
            }
            
            //[1,1,1,1]   10 도달 x 3 length
            //[2,2,3,3,]   10 도달 3 index -> length
            
            if(answer <= budget){
                count = d.length;
            }
            
        }
        
        return count;
    }
}