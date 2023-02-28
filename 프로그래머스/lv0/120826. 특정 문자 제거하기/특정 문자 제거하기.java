class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] array = my_string.split("");
        
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(letter)){
                answer += array[i];
            }
        }
        return answer;
    }
}