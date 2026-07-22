import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] arr) {
        
        Deque<Integer> stk = new ArrayDeque<>();
        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.addLast(arr[i++]);
              
            }
            else if(stk.peekLast() == arr[i]){
                stk.removeLast();
                i++;
                
            }
            else{
                stk.addLast(arr[i++]);
                
            }
        }
        
        if(stk.isEmpty()){
            stk.push(-1);
        }
        return stk.stream().mapToInt(j -> j).toArray();
    }
}