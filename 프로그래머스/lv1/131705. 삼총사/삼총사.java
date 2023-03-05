class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
//         [-2, 3, 0, 2, -5]
        
//         -2 : 3 : 0 2 1-5
//              0 : 2, 15
//              2 : -5 
//         3  : 0, : 2 -5 
//              2, : 1 -5
        
//         0   
        
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                for(int l = j+1; l < number.length; l++){
                    System.out.print(number[i]);
                    System.out.print(",");
                    System.out.print(number[j]);
                    System.out.print(",");
                    System.out.print(number[l]);
                    System.out.print("\n");
                    
                    if (number[i] + number[j] + number[l] ==0){
                        answer += 1;
                    }
                }
               
            }

        }
            
        
        return answer;
    }
}