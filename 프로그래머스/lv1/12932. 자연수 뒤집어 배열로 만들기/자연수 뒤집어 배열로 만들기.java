import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        char[] charArray = ("" + n).toCharArray();

        for(int i = charArray.length-1; i >= 0; i--){
            answer.add(Character.getNumericValue(charArray[i]));
        }
        return answer;
    }
}