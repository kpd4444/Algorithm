import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[][] score) {
        int[] sum = new int[score.length];
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            sum[i] = score[i][0] + score[i][1];
        }
        for(int i = 0; i < score.length;i++){
            int rank =1;
            for(int j = 0; j < score.length; j++){
                if(sum[i] <sum[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
       
        
        
        
        return answer;
    }
    
    
}