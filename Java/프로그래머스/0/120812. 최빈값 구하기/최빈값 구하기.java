import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        int max = 0;
        boolean more = false;
        int result = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) > max){
                result = i;
                max = map.get(i);
                more = false;
            }
            else if(map.get(i) == max){
                more = true;
            }
        }
        
        if(more){
            return -1;
        }
        
        return result;
    }
}