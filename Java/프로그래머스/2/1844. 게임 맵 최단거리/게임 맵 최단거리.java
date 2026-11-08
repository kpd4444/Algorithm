import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        return bfs(maps, new boolean[n][m]);
    }
    
    private int bfs(int[][] maps, boolean[][] visited){
        Queue<int[]> queue = new ArrayDeque<>();
        int n = maps.length;
        int m = maps[0].length; 
        
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int d = current[2];
            
            if(r == n - 1 && c == m - 1){
                return d;
            }
            
            for(int i = 0; i < 4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if(nr < 0 || nr >= n || nc < 0 || nc >= m){
                    continue;
                }
                if(!visited[nr][nc] && maps[nr][nc] == 1){
                    queue.offer(new int[]{nr, nc, d + 1});
                    visited[nr][nc] = true;
                }
            }
        }
        return -1;
    }
}