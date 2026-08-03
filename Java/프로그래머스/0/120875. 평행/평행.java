import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[][] dots) {
        if(isParallel(dots[0] , dots[1], dots[2], dots[3])){
            return 1;
        }
        if(isParallel(dots[0] , dots[2], dots[1], dots[3])){
            return 1;
        }
        if(isParallel(dots[0] , dots[3], dots[1], dots[2])){
            return 1;
        }
        return 0;
    }
    private boolean isParallel(int []p1 , int[] p2, int[] p3, int []p4){
        int dy1 = p1[1] - p2[1];
        int dx1 = p1[0] - p2[0];
        
        int dy2 = p3[1] - p4[1];
        int dx2 = p3[0] - p4[0];
        
        return dx1 * dy2 == dx2 * dy1; 
    }
}