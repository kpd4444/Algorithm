class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[k * picture.length];
        
        int idx = 0;
        for(String s : picture){
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < s.length(); i++){
                sb.append(String.valueOf(s.charAt(i)).repeat(k));
            }
            for(int i = 0 ; i < k; i++){
                answer[idx++] = sb.toString();
            }
        }
        
        
        return answer;
    }
}