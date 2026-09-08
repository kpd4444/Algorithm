class Solution {
    public int solution(int n, int m, int[] section) {
        int[] wall = new int[n];
        for(int i : section){
            wall[i - 1] = -1;
        }
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(wall[i] == 0){
                continue;
            }
            count++;
            for(int j = i; j < i + m; j++){
                if(j >= n){
                    return count;
                }
                wall[j] = 0;
            }
            
        }
        
        
        return count;
    }
}