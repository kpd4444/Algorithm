class Solution {
    public int solution(int n) {
        long temp = 1;
        int count = 1;
        while(temp <= n){
            
            
            if(temp > n ){
                break;
            }
            
            temp = temp * ++count ;
        }
        count--;
        return count;
    }
}