import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(String s) {
        String[] split = s.split(" ");
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(String si : split){
            if(!si.equals("Z")){
                stack.push(Integer.valueOf(si));
            }
            else{
                stack.pop();
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}