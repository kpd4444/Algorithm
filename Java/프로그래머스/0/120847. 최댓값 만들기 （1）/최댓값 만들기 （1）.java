
class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int n = numbers.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n;j++){
                if(numbers[i]*numbers[j] > max){
                    max = numbers[i]*numbers[j];
                }
            }
        }
        return max;
    }
}