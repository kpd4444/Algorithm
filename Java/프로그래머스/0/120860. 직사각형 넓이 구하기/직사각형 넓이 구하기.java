class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int answer = 0;
        for(int i =1; i <=3; i ++){
            if(x != dots[i][0] && y != dots[i][1]){
                answer = Math.abs(x - dots[i][0]) * Math.abs(dots[i][1] - y);
                break;
            }
        }
     
        return answer;
    }
}