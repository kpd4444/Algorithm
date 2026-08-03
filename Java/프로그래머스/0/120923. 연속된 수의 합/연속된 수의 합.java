class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num % 2 != 0){
            int idx = 0;
            for(int i = (total / num) - num / 2 ; i <= (total / num) + num / 2 ; i++){
                answer[idx++] = i;
            }
        }
        else{
            int idx = 0;
            for(int i = (total / num) - num / 2 + 1 ; i <= (total / num) + num / 2 ; i++){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}