class Solution {
    public int[] solution(int n, int[] numlist) {
        int [] numbers = new int[numlist.length];
        
        int index = 0;
        for(int i : numlist){
            if(i%n == 0){
                numbers[index++] = i;
            }
        }
        
        int [] result = new int[index];
        for(int i = 0 ; i< index; i++){
            result[i] = numbers[i];
        }
        
        return result;
        
    }
}