import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
     
        List<Integer> list = new ArrayList<>();
        for(int i =l; i <= r; i++){
            if(String.valueOf(i).matches(".*[12346789].*")){
                continue;
            }
            list.add(i);
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list.stream().mapToInt(i ->i).toArray();
    }
}