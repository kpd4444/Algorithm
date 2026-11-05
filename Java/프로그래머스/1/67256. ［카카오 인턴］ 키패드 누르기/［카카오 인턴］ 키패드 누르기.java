class Solution {
    public String solution(int[] numbers, String hand) {
        int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 0, 12}};//* 을 10 # 을 12
        
        StringBuilder sb = new StringBuilder();
        int[] lHand = {3, 0};
        int[] rHand = {3, 2};
        for(int n : numbers){
            if(n == 1 || n == 4 || n == 7){
                sb.append("L");
                for(int i = 0; i < keypad.length - 1; i++){
                    if(keypad[i][0] == n){
                        lHand[0] = i;
                        lHand[1] = 0;
                    }
                }
            }
            else if(n == 3 || n == 6 || n == 9){
                sb.append("R");
                for(int i = 0; i < keypad.length - 1; i++){
                    if(keypad[i][2] == n){
                        rHand[0] = i;
                        rHand[1] = 2;
                    }
                }
            }
            else{
                int targetX = 1;
                int targetY = 0;
                for(int i = 0; i < 4; i++){
                    if(keypad[i][1] == n){
                        targetY = i;
                    }
                }
                int lD = Math.abs(targetX - lHand[1]) + Math.abs(targetY - lHand[0]);
                
                int rD = Math.abs(targetX - rHand[1]) + Math.abs(targetY - rHand[0]);
                if(lD < rD){
                    sb.append("L");
                    lHand[0] = targetY;
                    lHand[1] = 1;
                }
                else if(lD > rD){
                    sb.append("R");
                    rHand[0] = targetY;
                    rHand[1] = 1;
                }
                else{
                    if(hand.equals("right")){
                        sb.append("R");
                        rHand[0] = targetY;
                        rHand[1] = 1;
                    }
                    else{
                        sb.append("L");
                        lHand[0] = targetY;
                        lHand[1] = 1;
                    }
                }
                
            }
        }
        
        return sb.toString();
    }
}