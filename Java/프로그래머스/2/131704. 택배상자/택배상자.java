import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] order) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = order.length;
        int index = 1;
        int count = 0;
        for(int o : order){
            while(index < o){
                stack.push(index++);
            }
            if(index == o){
                count++;
                index++;
            }
            else if(!stack.isEmpty() && stack.peek() == o){
                
                count++;
                stack.pop();
            }
            else{
                break;
            }
            
        }
        
       
        return count;
    }
}