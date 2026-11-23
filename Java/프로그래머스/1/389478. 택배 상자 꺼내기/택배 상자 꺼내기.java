import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int n, int w, int num) {
        Map<Integer, Deque<Integer>> box = new HashMap<>();
        for(int i = 1; i <= w; i++){
            box.put(i, new ArrayDeque<>());
        }
        int key = 1;
        for(int i = 1; i <= n; i++){
            box.get(key).push(i);
            
            if(i % w == 0){
                continue;
            }
            else if((i / w) % 2 == 0){
                key++;
            }
            else{
                key--;
            }
            
        }

        for(int i = 1; i <= w; i++){
            int count = 1;
            while(!box.get(i).isEmpty()){
                int j = box.get(i).pop();
                if(j == num){
                    return count;
                }
                count++;
            }
        }
        
        return 0;
    }
}