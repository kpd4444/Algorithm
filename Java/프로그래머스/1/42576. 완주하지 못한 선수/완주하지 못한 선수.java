import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for(String c : completion){
            map.put(c, map.getOrDefault(c , 0) + 1);
        }
        
        for(String p : participant){
            if(!map.containsKey(p)){
                result = p;
                break;
            }
            else if(map.get(p) < 1){
                result = p;
                break;
            }
            else{
                map.replace(p, map.get(p) - 1);
            }
        }
        
        return result;
    }
}