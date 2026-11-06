import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        int n = friends.length;
        for(int i = 0; i < n; i++){
            map.put(friends[i], i);
        }
        int[][] score = new int[n][n];
        for(String gift : gifts){
            String[] split = gift.split(" ");
            String from = split[0];
            String to = split[1];
            
            score[map.get(from)][map.get(to)]++;
        }
        int[] present = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                present[i] += score[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                present[i] -= score[j][i];
            }
        }
        int[] count = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(score[i][j] > score[j][i]){
                    count[i]++;
                }
                else if(score[i][j] < score[j][i]){
                    count[j]++;
                }
                else{
                    if(present[i] > present[j]){
                        count[i]++;
                    }
                    else if(present[i] < present[j]){
                        count[j]++;
                    }
                }
            }
        }
        
        
        return Arrays.stream(count).max().getAsInt();
    }
}