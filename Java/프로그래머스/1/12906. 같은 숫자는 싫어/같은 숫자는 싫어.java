import java.util.Deque;
import java.util.ArrayDeque;


public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i : arr){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }
            if(stack.peek() != i){
                stack.push(i);
            }
        }
        int []answer = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0 ; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}