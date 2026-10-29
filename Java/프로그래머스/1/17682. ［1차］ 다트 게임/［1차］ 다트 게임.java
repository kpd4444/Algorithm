class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int idx = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }
            else if(c == 'S'){
                score[idx++] = Integer.valueOf(sb.toString());
                sb.delete(0, sb.length());
            }
            else if(c == 'D'){
                score[idx++] = Integer.valueOf(sb.toString());
                score[idx - 1] = score[idx - 1] * score[idx - 1];
                sb.delete(0, sb.length());
            }
            else if(c == 'T'){
                score[idx++] = Integer.valueOf(sb.toString());
                score[idx - 1] = score[idx - 1] * 
                    score[idx - 1] * score[idx - 1];
                sb.delete(0, sb.length());
            }
            else if(c == '*'){
                score[idx - 1] = score[idx - 1] * 2;
                if(idx - 1 > 0){
                    score[idx - 2] = score[idx - 2] * 2;
                }
            }else if(c == '#'){
                score[idx - 1] = score[idx - 1] * (-1);
            }
            
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}