class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean [] existence = new boolean[10];
        
        for(int i : numbers){
            existence[i] = true;
        }
        for(int i = 1; i <= 9; i++){
            answer = existence[i] == false ? answer + i : answer;
        }
        
        
        return answer;
    }
}