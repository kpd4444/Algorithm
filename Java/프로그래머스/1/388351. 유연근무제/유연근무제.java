class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < timelogs.length; i++){
            boolean good = true;     
            for(int j = 0; j < 7; j++){
                if(((j + startday) % 7) == 6 || ((j + startday) % 7) == 0){
                    continue;
                }
                int lateTime = schedules[i] + 10;
                if(lateTime % 100 >= 60){
                    lateTime = lateTime + 100 - 60;
                }
                if(timelogs[i][j] > lateTime){
                    good = false;
                    break;
                }               
            }
            if(good){
                answer++;
            }
        }
        
        return answer;
    }
}