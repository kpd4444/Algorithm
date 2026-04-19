class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        
        for(int i : numbers){
            sum+=i;
        }
        
        return sum / (double)numbers.length;
    }
}