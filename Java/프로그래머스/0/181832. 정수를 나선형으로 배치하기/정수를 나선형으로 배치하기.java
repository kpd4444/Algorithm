class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        int r = 0;
        int c = 0;
        int index = 0;
        
        for(int i = 1; i <= n * n; i++){
            answer[r][c] = i;
            int nr = r + dr[index];
            int nc = c + dc[index];
            
            while(nr < 0 || nr >= n || nc < 0 || nc >= n || answer[nr][nc] != 0){
                if(i == n * n){
                    break;
                }
                index++;
                index = index == 4 ? 0 : index;
                nr = r + dr[index];
                nc = c + dc[index];
            }
            r = nr;
            c = nc;
        }
        return answer;
    }
}