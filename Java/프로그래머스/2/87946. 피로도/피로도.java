class Solution {
    int max;
    public int solution(int k, int[][] dungeons) {
        max = 0;
        dfs(k, dungeons, 0, new boolean[dungeons.length]);
        return max;
    }
    
    private void dfs(int k, int[][] dungeons, int count, boolean[] visited){
        if(max < count){
            max = count;
        }
        for(int i = 0; i < dungeons.length; i++){
            if(dungeons[i][0] <= k && !visited[i]){
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, count + 1, visited);
                visited[i] = false;
            }
        }
    }
}