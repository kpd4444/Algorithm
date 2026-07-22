import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String my_string, int[][] queries) {
        Deque<Character> stack = new ArrayDeque<>();
        
        char [] array = my_string.toCharArray();
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                stack.push(array[j]);
            }
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                array[j] = stack.pop();
            }
        }
        
        return String.valueOf(array);
    }
}