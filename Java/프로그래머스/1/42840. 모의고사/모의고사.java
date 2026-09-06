import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            num1 = i % p1.length;
            num2 = i % p2.length;
            num3 = i % p3.length;
            
            if(p1[num1] == answers[i]){
                count1++;
            }
            if(p2[num2] == answers[i]){
                count2++;
            }
            if(p3[num3] == answers[i]){
                count3++;
            }
            
        }    
        List<Integer> list = new ArrayList<>();
        if(count1 >= count2 && count1 >= count3){
            list.add(1);
        }
        
        if(count2 >= count1 && count2 >= count3){
            list.add(2);
        }
        if(count3 >= count1 && count3 >= count2){
            list.add(3);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}