import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> students = new TreeMap<>();
        for(int i = 0 ; i < rank.length; i++){
             students.put(rank[i], i);
        }
        int count = 0;
        int [] result = new int[3];
        for(Integer i : students.keySet()){
            if(count==3){
                break;
            }
            if(attendance[students.get(i)]){
                result[count++] = students.get(i);
            }
            
        }
        
        return 10000 * result[0] + 100 * result[1] + result[2];
    }
}