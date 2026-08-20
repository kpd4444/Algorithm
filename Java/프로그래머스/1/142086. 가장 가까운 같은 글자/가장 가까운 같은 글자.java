class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        int[] alpha = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(alpha[c - 'a'] == 0){
                
                result[i] = -1;
                for(int j = 0; j < alpha.length; j++){
                    if(alpha[j] != 0){
                        alpha[j]++;
                    }
                }
                alpha[c - 'a']++;
            }
            else{
                result[i] = alpha[c - 'a'];
                alpha[c - 'a'] = 0;
                for(int j = 0; j < alpha.length; j++){
                    if(alpha[j] != 0){
                        alpha[j]++;
                    }
                }
                alpha[c - 'a']++;
            }
        }
        
        return result;
    }
}