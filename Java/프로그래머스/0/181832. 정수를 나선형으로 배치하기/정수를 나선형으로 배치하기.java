class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int column = 0;
        int row = 0;
        int mode = 0;  // 0 -> 오른쪽, 1 -> 아래 , 2 -> 왼쪽 , 3 -> 위
        
        for(int i = 1; i <= n * n; i++){
            answer[row][column] = i;
            switch(mode){
                case 0: //오른쪽으로 가고 있을때
                    if(column + 1 >= n || answer[row][column + 1] != 0){
                        mode = (mode + 1) % 4;
                        row++;
                        break;
                    }
                    column++;
                    break;
                case 1: //아래
                    if(row + 1 >= n || answer[row + 1][column] != 0){
                        mode = (mode + 1) % 4;
                        column--;
                        break;
                    }
                    row++;
                    break;
                case 2://왼쪽
                    if(column - 1 < 0 || answer[row][column - 1] != 0){
                        mode = (mode + 1) % 4;
                        row--;
                        break;
                    }
                    column--;
                    break;
                case 3: //위로 가고 있을때
                    if(row - 1 < 0 || answer[row - 1][column] != 0){
                        mode = (mode + 1) % 4;
                        column++;
                        break;
                    }
                    row--;
                    break;
            }
        }
        
        return answer;
    }
}