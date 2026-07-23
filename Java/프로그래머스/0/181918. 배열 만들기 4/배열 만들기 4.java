import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.push(arr[i++]);
            }
            else if(stk.peek() < arr[i]){
                stk.push(arr[i++]);
            }
            
            else if(stk.peek() >= arr[i]){
                stk.pop();
            }
        }
        int []answer = new int[stk.size()];
        for(int j = stk.size() - 1; j >= 0; j--){
            answer[j] = stk.pop();
        }
        return answer;
    }
}