class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int n = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
        int[] answer = new int[n];
        int idx = 0;
        
        for(int j = 0; j < 2; j++){
            for(int i = intervals[j][0]; i <= intervals[j][1]; i++){
            answer[idx++] = arr[i];
            }
        }
        
        
        
        return answer;
    }
}