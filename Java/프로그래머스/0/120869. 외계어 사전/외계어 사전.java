class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(String s1 : dic){
            boolean isTrue = true;
            for(String s2 : spell){
                if(!s1.contains(s2)){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue && s1.length() == spell.length){
                return 1;
            }
        }
        return 2;
    }
}