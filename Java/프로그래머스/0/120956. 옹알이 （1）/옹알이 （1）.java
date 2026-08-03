class Solution {
    public int solution(String[] babbling) {
        String [] contain = {"aya", "ye", "woo", "ma"};
        int result = 0;
        for(String s : babbling){
            
            for(int i = 0; i < 4; i++){
                s = s.replace(contain[i], " ");
            }
            if(s.replace(" ", "").equals("")){
                result++;
            }
            
        }
        return result;
    }
}