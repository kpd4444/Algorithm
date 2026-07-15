import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        return Arrays.stream(intStrs)
                .map(a -> a.substring(s, s +l))
                .mapToInt(Integer::valueOf)
                .filter(a -> a > k)
                .toArray();
    }
}