import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, target);
        return answer;
    }
    private int dfs(int[] numbers, int start, int target){
        int n = numbers.length;
        int answer = 0;
        if(Arrays.stream(numbers).sum() == target){
            return 1;
        }
        
        for(int i = start; i < n; i++){
            numbers[i] = numbers[i] * (-1);
            answer += dfs(numbers, i + 1, target);
            numbers[i] = numbers[i] * (-1);
        }
        
        return answer;
    }
}