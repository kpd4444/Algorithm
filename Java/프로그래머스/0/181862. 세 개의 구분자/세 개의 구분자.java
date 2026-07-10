import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        int count = 0;
        for(String s : myStr.split("[abc]")){
            if(!s.isEmpty()){
                count++;
            }
        }

        if(count == 0){
            String [] answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }
        String [] answer = new String[count];
        int idx = 0;
        for(String s : myStr.split("[abc]")){
            if(!s.isEmpty()){
                answer[idx++] = s;
            }
        }

        return answer;
    }
}