class Solution {
    public int solution(int[] num_list) {
        int result;
        if(num_list.length >= 11){
            result = 0;
            for(int i : num_list){
                result += i;
            }
        }
        else{
            result = 1;
            for(int i : num_list){
                result *= i;
            }
        }
        return result;
    }
}