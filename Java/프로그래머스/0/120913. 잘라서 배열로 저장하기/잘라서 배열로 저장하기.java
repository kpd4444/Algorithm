class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[length];
        int idx = 0;
        for(int i = 0; i < length; i++){
            if(i == (length - 1)){
                answer[i] = my_str.substring(idx, my_str.length());
                break;
            }
            answer[i] = my_str.substring(idx, idx + n);
            idx += n;
            
        }
        
        return answer;
    }
}