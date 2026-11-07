import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '('){
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        
        return true;
    }
}