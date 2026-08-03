class Solution {
    public int solution(int[][] board) {
        
        int [][] danger = new int[board.length][board.length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    int row = i;
                    int column = j;
                    for(int k = row - 1; k <= row + 1; k++){
                        if(k < 0 || k > board.length - 1){
                            continue;
                        }
                        for(int l = column -1; l <= column + 1 ; l++){
                            if(l < 0 || l > board.length - 1){
                                continue;
                            }
                        
                            danger[k][l] = 1;
                        }
                    }
                    
                }
            }
        }
        int answer = 0;
        for(int i = 0; i < danger.length; i++){
            for(int j = 0; j < danger.length; j++){
                if(danger[i][j] == 0){
                    answer++;
                }
            }
        }
        
        
        return answer;
        
        
    }
}