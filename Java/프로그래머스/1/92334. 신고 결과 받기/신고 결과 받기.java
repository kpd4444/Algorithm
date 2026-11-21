import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] count = new int[id_list.length];
        
        Map<String, Integer> idIndex = new HashMap<>();
        Map<String, Set<String>> check = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            idIndex.put(id_list[i], i);
            check.put(id_list[i], new HashSet<>());
        }
        
        for(String re : report){
            String[] split = re.split(" ");
            String sender = split[0];
            String receiver = split[1];
            
            
            if(check.get(sender).contains(receiver)){
                continue;
            }
            check.get(sender).add(receiver);
            
            int i = idIndex.get(receiver);
            count[i]++;
        }
        
        int[] answer = new int[count.length];
        for(int i = 0; i < count.length; i++){
            if(count[i] < k){
                continue;
            }
            for(int j = 0; j < id_list.length; j++){
                if(check.get(id_list[j]).contains(id_list[i])){
                    answer[j]++;
                }
                
            }
        }
        
        return answer;
    }
}