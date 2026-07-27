class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        for(int i = 1; i <= share; i++){
            answer *= balls;
            balls--;
            answer /= i;
        }
    
        return (int)answer;
    }
}