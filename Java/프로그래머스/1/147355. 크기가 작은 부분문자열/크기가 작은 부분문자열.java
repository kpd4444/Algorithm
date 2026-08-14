class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long numberP = Long.parseLong(p);
        for(int i = 0; i <= t.length() - p.length(); i++){
            long numberT = Long.parseLong(t.substring(i , i + p.length()));
            if(numberP >= numberT){
                answer++;
            }
        }
        return answer;
    }
}