class Solution {
    public int solution(int[] array, int height) {
        int sum=0;
        for(int i = 0; i<array.length;i++){
            if(array[i] > height){
                sum++;
            }
        }
        return sum;
    }
}