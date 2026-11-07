import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        String[] answer = new String[n];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < n; i ++){
            map.put(players[i], i);
            answer[i] = players[i];
        }
        for(String c : callings){
            int num = map.get(c);
            map.put(c , map.get(c) - 1);
            
            String name = answer[num - 1];
            map.put(name, map.get(name) + 1);
            
            answer[num] = name;
            answer[num - 1] = c;
        }
        
        
        return answer;
    }
}