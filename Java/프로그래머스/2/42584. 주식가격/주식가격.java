import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < prices.length; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                    int pop = stack.pop();
                    answer[pop] = i - pop; 
                }
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            int pop = stack.pop();
            answer[pop] = prices.length - pop - 1;
        }
        
        return answer;
    }
}