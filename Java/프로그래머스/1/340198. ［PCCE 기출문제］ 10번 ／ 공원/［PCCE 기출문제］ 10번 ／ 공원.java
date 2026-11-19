import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        Arrays.sort(mats);
        int n = park.length;
        int m = park[0].length;
        
        int idx = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(park[i][j].equals("-1")){
                    while(check(park, i, j, mats[idx])){
                        
                        idx++;
                        if(idx == mats.length){
                            return mats[idx - 1];
                        }
                    }
                }
            }
        }
        if(idx == 0){
            return -1;
        }
         
        return mats[idx - 1];
    }
    
    private boolean check(String[][] park, int si,int  sj, int size){
        int n = park.length;
        int m = park[0].length;
        
        if(si + size - 1 >= n || sj + size - 1 >= m){
            return false;
        }
        
        for(int i = si; i < si + size; i++){
            for(int j = sj; j < sj + size; j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}