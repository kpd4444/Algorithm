import java.util.Arrays;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alpha = new int[26];
        Arrays.fill(alpha, 1000);
        
        for(String word : keymap){
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(alpha[c - 'A'] > (i + 1)){
                    alpha[c - 'A'] = i + 1;
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);
                answer[i] += alpha[c - 'A'];
                if(answer[i] >= 1000){
                    answer[i] = -1;
                    break;
                }
            }
            
        }
        
        
        return answer;
    }
}