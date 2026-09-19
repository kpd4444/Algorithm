class Solution {
    public int solution(String s) {
        int answer = 0;
        while(true){
            char x = s.charAt(0);
            int isX = 1;
            int noX = 0;
            int idx = 1;
            while(isX != noX){
                if(idx >= s.length()){
                    return ++answer;
                }
                if(s.charAt(idx++) == x){
                    isX++;
                }else{
                    noX++;
                }
            }
            s = s.substring(idx);
            answer++;
            if(s.length() <= 0){
                break;
            }
        }
        return answer;
    }
}