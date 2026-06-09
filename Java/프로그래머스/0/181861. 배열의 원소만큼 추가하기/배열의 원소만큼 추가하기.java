class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        int idx = 0;
        int [] answer = new int[sum];
        for(int i : arr){
            for(int j = 0; j < i; j++){
                answer[idx++] = i;
            }
                
        }
        return answer;
    }
}