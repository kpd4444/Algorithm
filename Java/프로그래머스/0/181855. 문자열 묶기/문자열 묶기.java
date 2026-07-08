import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] length = new int[31];
        
        for(String s : strArr){
            length[s.length()]++;
        }
        return Arrays.stream(length).max().getAsInt();
        
    }
}