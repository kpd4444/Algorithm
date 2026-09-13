
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] score = new double[N + 1];
        
        int allCount = stages.length;
        for(int i = 1; i <= N; i++){
            int count = 0;
            for(int s : stages){
                if(s == i){
                    count++;
                }
            }if(allCount == 0){
                score[i] = 0.0;
            }else{
                score[i] = (double)count / allCount;
                allCount -= count;
            }
            
        }
        int [] answer = new int[N];
        for(int i = 0; i < N; i++){
            double max = -1.0;
            int idx = -1;
            for(int j = 1; j <= N ; j++){
                if(score[j] > max){
                    max = score[j];
                    idx = j;
                }
            }
            answer[i] = idx;
            score[idx] = -1.0;
        }
        
        return answer;
    }
}