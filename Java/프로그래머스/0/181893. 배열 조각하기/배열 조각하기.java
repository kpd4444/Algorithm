import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
       
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                int size = list.size();
                for(int j = query[i] + 1 ; j < size; j++){
                    list.removeLast();
                }
            }
            else{
                for(int j = 0 ; j < query[i]; j++){
                    list.removeFirst();
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}