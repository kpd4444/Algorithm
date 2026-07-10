import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList <String> list = new ArrayList<>();

        for (String s : myStr.split("[abc]")) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        if(list.size() == 0){
            return new String[] {"EMPTY"};
        }
        
    

        return list.toArray(new String[0]);
    }
}