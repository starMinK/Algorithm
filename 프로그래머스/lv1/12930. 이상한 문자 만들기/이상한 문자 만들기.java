class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++){
            if (arr[i].equals(" ")){
                idx = 0 ;  
            } else {
                idx += 1;
            }
            
            if(idx % 2 != 0){
                answer += arr[i].toUpperCase();
            }else{
                answer += arr[i].toLowerCase();
            }
        
        }
        
        
        //my name is   gyumin
      
        
        /*
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if(j % 2 == 0){
                    
                    //System.out.println(Character.toUpperCase(arr[i].charAt(j)));
     
                    answer += Character.toUpperCase(arr[i].charAt(j));
                }else{
                    //System.out.println(Character.toLowerCase(arr[i].charAt(j)));
                    answer += Character.toLowerCase(arr[i].charAt(j));
                }
            }
            if(i < arr.length - 1){
             answer += " ";   
            }
        }
        */
        return answer;
    }
}