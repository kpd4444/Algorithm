class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxX = board[0] / 2;
        int minX = board[0] / 2 * (-1);
        int maxY = board[1] / 2;
        int minY = board[1] / 2 * (-1);
        
        int currentX = 0;
        int currentY = 0;
        
        for(String s : keyinput){
            switch(s){
                case "left":
                    if(currentX <= minX){
                        break;
                    }
                    currentX--;
                    break;
                case "right":
                    if(currentX >= maxX){
                        break;
                    }
                    currentX++;
                    break;
                case "up":
                    if(currentY >= maxY){
                        break;
                    }
                    currentY++;
                    break;
                case "down":
                    if(currentY <= minY){
                        break;
                    }
                    currentY--;
                    break;
            }
        }
        answer[0] = currentX;
        answer[1] = currentY;
        return answer;
    }
}