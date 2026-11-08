import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        char[][] grid = new char[n][m];
        
        int sr = 0;
        int sc = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = board[i].charAt(j);
                if(grid[i][j] == 'R'){
                    sr = i;
                    sc = j;
                }
            }
        }
        
        return bfs(grid, sr, sc, new boolean[n][m]);
    }
    private int bfs(char[][] grid, int sr, int sc, boolean[][] visited){
        Queue<int[]> queue = new ArrayDeque<>();
        int n = grid.length;
        int m = grid[0].length;
        
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        queue.offer(new int[]{sr, sc, 0});
        visited[sr][sc] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            
            if(grid[r][c] == 'G'){
                return current[2];
            }
            
            for(int i = 0; i < 4; i++){
                int nr = r;
                int nc = c;
                
                while(nr + dr[i] >= 0 && nr + dr[i] < n 
                     && nc + dc[i] >=0 && nc + dc[i] < m
                     && grid[nr+dr[i]][nc + dc[i]] != 'D'){
                    nr = nr + dr[i];
                    nc = nc + dc[i];
                }     
                
                
                if(!visited[nr][nc]){
                    queue.offer(new int[]{nr, nc, current[2] + 1});
                    visited[nr][nc] = true;
                }
            }
        }
        
        return -1;
    }
    
}