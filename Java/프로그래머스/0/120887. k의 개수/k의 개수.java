class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int idx = i; idx <= j; idx++){
            int temp = idx;
            while(temp != 0){
                if(temp % 10 == k){
                    answer++;
                }
                temp /= 10;
            }
        }
        
        
    
        
        return answer;
    }
}