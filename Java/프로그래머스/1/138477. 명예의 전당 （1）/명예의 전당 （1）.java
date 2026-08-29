import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            list.sort(Comparator.naturalOrder());
            if(list.size() <= k){
                answer[i] = list.get(0);
            }else{
                answer[i] = list.get(list.size() - k);
            }
        }
        
        return answer;
    }
}