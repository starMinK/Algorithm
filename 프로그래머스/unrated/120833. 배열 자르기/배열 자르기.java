class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int loop = num2 - num1 + 1;
        int[] answer = new int[loop];
        for (int i = 0; i < loop; i++) {
            answer[i] = numbers[i + num1];
        }
        return answer;
    }
}