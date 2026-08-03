class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int [] line = new int[200];
        
        for(int i = 0; i < 3; i++){
            for(int j = lines[i][0]; j < lines[i][1]; j++){
                line[j + 100]++;
            }
        }
        
        for(int i = 0; i < 200; i++){
            if(line[i] >=2){
                answer++;
            }
        }
        
        return answer;
    }
}