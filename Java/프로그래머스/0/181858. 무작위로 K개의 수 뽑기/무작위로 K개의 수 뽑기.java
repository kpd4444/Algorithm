import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        for(int i = 0; i < arr.length; i++){
            if(set.size() < k){
                set.add(arr[i]);
            }
        }
        int idx = 0;
        for(int i : set){
            answer[idx++] = i;
        }
        
        return answer;
    }
}