class Solution {
    public int solution(int n) {
        int answer = 0;
        String answerStr = "";
        String trit = Integer.toString(n, 3);
        char[] tritArr = trit.toCharArray();
        for(int i = tritArr.length-1; i >= 0; i--) {
            answerStr += tritArr[i];
        }
        answer = Integer.parseInt(answerStr, 3);
        return answer;
    }
}