import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {

        char [] beforeChar = before.toCharArray();
        char [] afterChar = after.toCharArray();
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        for(int i = 0; i < before.length(); i++){
            if(beforeChar[i] != afterChar[i]){
                return 0;
            }
        }
        return 1;
    }
}