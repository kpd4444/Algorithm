import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int [] temp = {a,b,c,d};
        Arrays.sort(temp);
        
        // 4개 모두 같다면
        if(temp[0] == temp[3]){
            answer = 1111 * temp[0];
        }
        //4개 다 다르면
        else if(temp[0] != temp[1] && temp[1] != temp[2] && temp[2] != temp[3]){
            answer = temp[0];
        }
        //4개중에 3개가 같고 하나만 다르면 
        else if(temp[0] == temp[2] && temp[0] != temp[3]){
            answer = (temp[0] * 10 + temp[3]) * (temp[0] * 10 + temp[3]);
        } // 4개중에 3개가 같고 하나만 다르면
        else if(temp[1] == temp[3] && temp[0] != temp[3]){
            answer = (temp[3] * 10 + temp[0]) * (temp[3] * 10 + temp[0]);
        }//4개중에 2개씩만 같으면
        else if(temp[0] == temp[1] && temp[1] != temp[2] &&temp[2] == temp[3]){
            answer = (temp[0] + temp[3]) * Math.abs(temp[0] - temp[3]);
        }
        else if(temp[0] == temp[1] && temp[1] != temp[2] && temp[2] != temp[3]){
            answer = temp[2] * temp[3];
        }
        else if(temp[1] == temp[2] && temp[0] != temp[1] && temp[2] != temp[3]){
            answer = temp[0] * temp[3];
        }
        else if(temp[2] == temp[3] && temp[0] != temp[1] && temp[1] != temp[2]){
            answer = temp[0] * temp[1];
        }
        
        return answer;
    }
}