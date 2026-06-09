class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;
        
        for(int i : num_list){
            product *= i;
            sum += i;
        }
        
        return product < Math.pow(sum,2) ? 1 : 0;
    }
}