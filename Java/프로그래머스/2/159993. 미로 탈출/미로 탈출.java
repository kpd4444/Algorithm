import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(String[] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length();
        char[][] grid = new char[n][m];
        int sr = 0;
        int sc = 0;
        int lr = 0;
        int lc = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = maps[i].charAt(j);
                if(grid[i][j] == 'S'){
                    sr = i;
                    sc = j;
                }
                if(grid[i][j] == 'L'){
                    lr = i;
                    lc = j;
                }
            }
        }
        int toL =bfs(grid, sr, sc, new boolean[n][m], 'L');
        int toR = bfs(grid, lr, lc, new boolean[n][m], 'E');
        
        if(toL == -1 || toR == -1){
            return -1;
        }
        
        return toL + toR;
    }
    private int bfs(char[][] grid,int sr, int sc, boolean[][] visited, char target){
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
            int d = current[2];
            
            if(grid[r][c] == target){
                return d;
            }
            
            for(int i = 0; i < 4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if(nr < 0 || nr >= n || nc < 0 || nc >= m){
                    continue;
                }
                if(!visited[nr][nc] && grid[nr][nc] != 'X'){
                    queue.offer(new int[]{nr, nc, d + 1});
                    visited[nr][nc] = true;
                }
            }
        }
        
        return -1;
    }
}