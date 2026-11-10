class Solution {
    public int solution(int n) {
        
        int number = n + 1;
        
        while(true){
           
            if(Integer.bitCount(n) == Integer.bitCount(number)){
                break;
            }
            number++;
            
        }
        return number;
    }
}