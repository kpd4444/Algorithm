import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int min = arr[0];
        
        for(int i= 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i : arr){
            if(i != min){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}