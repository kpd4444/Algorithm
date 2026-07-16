import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] priority = Arrays.stream(emergency).
            boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).toArray();
    
        for(int i = 0; i < emergency.length; i++){
            for(int j = emergency.length -1; j >= 0; j--){
                if(emergency[i] == priority[j]){
                    answer[i] = j + 1;
                }
            }
        }
        
        return answer;
    }
}