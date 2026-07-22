import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        int i = 2;
        while(n != 1){
            while(n % i == 0){
                n /= i;
                set.add(i);
            }   
            i++;
        }
        return set.stream().mapToInt(j -> j).toArray();
    }
}