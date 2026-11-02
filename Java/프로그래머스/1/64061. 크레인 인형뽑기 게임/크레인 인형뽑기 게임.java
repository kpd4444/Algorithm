import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int n = board.length;
        int []index = new int[n];
        Arrays.fill(index, n);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[j][i] != 0){
                    index[i] = j;
                    break;
                }
            }
        }
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        int answer = 0; 
        for(int m : moves){
            if(index[m - 1] >= n){
                continue;
            }
            if(!stack.isEmpty() && stack.peek() == board[index[m - 1]][m - 1]){
                stack.pop();
                answer += 2;
                index[m - 1]++;
                continue;
            }
            stack.push(board[index[m - 1]][m - 1]);
            index[m - 1]++;
            
        }
        
        
        return answer;
    }
}