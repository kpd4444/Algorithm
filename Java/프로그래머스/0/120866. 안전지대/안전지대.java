class Solution {
    public int solution(int[][] board) {
        
        int n = board.length;
        int [][] danger = new int[n][n];
        
        int[] dr = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dc = {1, 1, 0, -1, -1, -1, 0, 1};
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
                if(board[i][j] == 1){
                    danger[i][j] = 1;
                    for(int k = 0; k < 8; k++){
                        int nr = i + dr[k];
                        int nc = j + dc[k];
                    
                        if(nr < 0 || nr >= n || nc < 0 || nc >= n){
                            continue;
                        }
                        danger[nr][nc] = 1;
                    }
                }
                
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(danger[i][j] == 0){
                    count++;
                }
            }
        }
        
        return count;
        
        
    }
}