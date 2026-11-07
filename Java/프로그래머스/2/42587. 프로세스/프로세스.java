import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int n = priorities.length;
        Queue<int[]> queue = new ArrayDeque<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            queue.offer(new int[]{i, priorities[i]});
            pq.offer(priorities[i]);
        }
        int count = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int index = current[0];
            int value = current[1];
            
            if(value >= pq.peek()){
                pq.poll();
                count++;
                if(index == location){
                    return count;
                }
            }else{
                queue.offer(current);
            }
        }
        
        return 0;
    }
}