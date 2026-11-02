import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
       
        int index = getIndex(ext);
        int sort = getIndex(sort_by);
        int [][] answer = Arrays.stream(data)
            .filter(i -> i[index] < val_ext)
            .sorted(Comparator.comparingInt(i -> i[sort]))
            .toArray(int[][]::new);
        
        
        
        return answer;
    }
    private int getIndex(String ext){
        int index = 0;
        switch(ext){
            case "code":
                index = 0;
                break;
            case "date":
                index = 1;
                break;
            case "maximum":
                index = 2;
                break;
            case "remain":
                index = 3;
                break;
        }
        return index;
    }
    
    
}