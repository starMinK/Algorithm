class Solution {
    public int[] solution(int[] arr) {
              int[] answer = new int[arr.length-1];

        int iMin = 999;
        if(arr.length > 1) {
            for(int i : arr) iMin = Math.min(i, iMin);
            for(int i=0, j=0; i < arr.length; i++){
                if(arr[i] != iMin) {
                    answer[j] = arr[i];
                    j++;
                }
            }
        }else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}