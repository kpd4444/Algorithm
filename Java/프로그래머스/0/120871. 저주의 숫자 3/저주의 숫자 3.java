class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n ; i++){
            
            
            while(String.valueOf(answer).contains("3") || answer % 3 == 0){
                answer++;
                
            }
            answer++;
            
        }
        return answer - 1;
    }
}