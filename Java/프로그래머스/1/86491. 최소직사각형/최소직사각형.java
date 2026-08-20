class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int maxX = 1;
        int maxY = 1;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > maxX){
                maxX = sizes[i][0];
            }
            if(sizes[i][1] > maxY){
                maxY = sizes[i][1];
            }
            
        }
        
        return maxX * maxY;
    }
}