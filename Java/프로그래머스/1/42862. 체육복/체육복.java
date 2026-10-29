import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] students = new boolean[n];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        
        Arrays.fill(students, true);
        for(int i : lost){
            students[i - 1] = false;
        }
        
        for(int i = 0; i < reserve.length; i++){
            if(students[reserve[i] - 1] == false){
                students[reserve[i] - 1] = true;
                reserve[i] = -1;
            }
        }
        
        for(int r : reserve){
            if(r == -1){
                continue;
            }
            
            
            if(r - 2 >= 0 && students[r - 2] == false){
                students[r - 2] = true;
            }
            
            else if(students[r - 1] == false){
                students[r - 1] = true;
            }
            else if(r <= n - 1 && students[r] == false){
                students[r] = true;
            }
        }
        
        for(boolean s : students){
            if(s == true){
                answer++;
            }
        }
        
        
        return answer;
    }
}