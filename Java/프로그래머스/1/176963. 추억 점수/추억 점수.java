import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int idx = 0;
        for(String []array : photo){
            int count = 0;
            int score = 0;
            for(int i = 0; i < array.length; i++){
                if(map.containsKey(array[i])){
                    count++;
                    score += map.get(array[i]);
                }
            }
            answer[idx++] = score;
        }
        
        return answer;
    }
}