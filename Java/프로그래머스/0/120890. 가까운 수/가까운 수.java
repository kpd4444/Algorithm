class Solution {
    public int solution(int[] array, int n) {
        int min = 100;
        int result = 100;
        for(int i : array){
            int subtraction = Math.abs(n - i);
            if(subtraction < min){
                min = subtraction;
                result = i;
                continue;
            }
            if(subtraction == min){
                result = Math.min(i,result);
            }
        }
        return result;
    }
}