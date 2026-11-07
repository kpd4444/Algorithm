import java.util.Queue;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        int n = progresses.length;
        for(int i = 0; i < n; i++){
            queue.offer(i);
        }
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            for(int i = 0; i < n; i++){
                progresses[i] += speeds[i];
            }
            int count = 0;
            while(!queue.isEmpty() &&progresses[queue.peek()] >= 100){
                count++;
                queue.poll();
            }
            if(count != 0){
                list.add(count);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}