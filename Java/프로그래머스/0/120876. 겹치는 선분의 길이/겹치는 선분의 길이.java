class Solution {
    public int solution(int[][] lines) {
        int[] check = new int[201];
        
        for(int[] line : lines){
            for(int i = line[0]; i < line[1]; i++){
                check[i + 100]++;
            }
        }
        int count = 0;
        for(int i = 0; i <= 200; i++){
            if(check[i] >= 2){
                count++;
            }
        }
        return count;
    }
}