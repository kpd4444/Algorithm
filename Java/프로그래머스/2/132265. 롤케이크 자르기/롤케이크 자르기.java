import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;
        
        Map<Integer, Integer> p1 = new HashMap<>();
        Map<Integer, Integer> p2 = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            p1.put(topping[i], p1.getOrDefault(topping[i], 0) + 1);
        } 
        for(int i = 0; i < n - 1; i++){
            p2.put(topping[i], p2.getOrDefault(topping[i], 0) + 1);
            p1.put(topping[i], p1.get(topping[i]) - 1);
            if(p1.get(topping[i]) == 0){
                p1.remove(topping[i]);
            }
            if(p1.size() == p2.size()){
                answer++;
            }
        }
        
        return answer ;
    }
}