class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
//        System.out.println((char)(s.charAt(0)+1));
        for(int i = 0; i < s.length(); i++){
            if(s.split("")[i].equals(" ")){
                answer += " ";
            }else{
                //소문자인데 초과한경우
                if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                    //System.out.println((s.charAt(i) - 'a' + n )% 26 + 'a');
//                                           char(104   -  97 + n == +n을 했을때 알파벳에서 몇번째냐 5번째 + 'a' 97)
                    
                    
                    answer += (char)((s.charAt(i) - 'a' + n )% 26 + 'a');
                }else if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {//대문자인데 초과한 경우
                    //System.out.println((s.charAt(i) - 'A' + n )% 26 +'a');
                    answer += (char)((s.charAt(i) - 'A' + n )% 26 + 'A');
                }
            }
        }
        return answer;
    }
}