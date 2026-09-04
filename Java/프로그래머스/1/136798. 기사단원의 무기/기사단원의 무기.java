class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorsNum = count_divisors(number);
        int answer = 0;
        for(int i = 0; i < number; i++){
            if(divisorsNum[i] > limit){
                divisorsNum[i] = power;
            }
            answer += divisorsNum[i];
        }
        
        return answer;
    }
    private static int[] count_divisors(int n){
        int [] answer = new int[n];
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            answer[i - 1] = count;
        }
        
        return answer;
    }
}