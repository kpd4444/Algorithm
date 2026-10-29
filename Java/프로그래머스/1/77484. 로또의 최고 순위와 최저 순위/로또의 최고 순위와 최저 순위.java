import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int l = 5;
        int r = 5;
        int count = 0;
        
        while(lottos[l] != 0){
            if(lottos[l] < win_nums[r]){
                r--;
            }else if(lottos[l] > win_nums[r]){
                l--;
            }else{
                l--;
                count++;
            }
            
            if(l < 0 || r < 0){
                break;
            }
        }
        
        while(l >= 0 && lottos[l] != 0){
            l--;
            if(l < 0){
                break;
            }
        }
        
        answer[0] = 7 - (count + (l + 1));
        answer[1] = 7 - count ;
        if(answer[1] >= 7){
            answer[1] = 6;
        }
        if(answer[0] >= 7){
            answer[0] = 6;
        }
        
        return answer;
    }
}