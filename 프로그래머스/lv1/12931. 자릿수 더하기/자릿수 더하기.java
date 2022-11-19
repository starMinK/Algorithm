import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String toString = Integer.toString(n);
        char[] charArray = toString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            answer += Character.getNumericValue(charArray[i]);
        }
        return answer;
    }
}