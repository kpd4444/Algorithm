import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        LinkedList<String> list = new LinkedList<>();
        for(String s : temp){
            if(!s.equals("")){
                list.add(s);
            }
        }
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}