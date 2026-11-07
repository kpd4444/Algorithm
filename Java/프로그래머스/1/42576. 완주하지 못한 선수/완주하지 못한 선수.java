import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String c : completion){
            map.put(c, map.getOrDefault(c , 0) + 1);
        }
        for(String p : participant){
            if(!map.containsKey(p)){
                return p;
            }
            else{
                if(map.get(p) == 1){
                    map.remove(p);
                }
                else{
                    map.put(p, map.get(p) - 1);
                }
                
            }
        }
        return "";
        
    }
}