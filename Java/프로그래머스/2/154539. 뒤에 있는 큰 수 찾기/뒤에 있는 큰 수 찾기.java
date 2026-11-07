import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                    answer[stack.pop()] = numbers[i];
                    
                }
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        return answer;
    }
}