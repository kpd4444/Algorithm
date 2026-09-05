class Solution {
    public String solution(int a, int b) {
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT" , "SUN", "MON", "TUE", "WED", "THU"};
        
        int idx = 0;
        
        for(int i = 0; i < a - 1; i++){
            for(int j = 1; j <= date[i]; j++){
                idx++;
                if(idx >= 7){
                    idx = 0;
                }
            }
        }
        for(int i = 1; i < b; i++){
            idx++;
            if(idx >= 7){
                idx = 0;
            }
        }
        return day[idx];
    }
}