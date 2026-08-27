import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] arr : commands){
            List<Integer> list = new ArrayList<>();
            for(int i = arr[0] - 1; i <= arr[1] - 1; i++){
                list.add(array[i]);
            }
            answer[idx++] = list.stream().sorted().toList().get(arr[2] - 1);
        }
        
        return answer;
    }
}