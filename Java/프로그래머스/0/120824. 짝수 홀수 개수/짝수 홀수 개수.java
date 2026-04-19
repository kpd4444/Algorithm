class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2];
        int even_num = 0;
        int odd_num = 0;
        for(int i : num_list){
            if(i%2 == 0){
                even_num++;
            }
            else{
                odd_num++;
            }
        }
        answer[0] = even_num;
        answer[1] = odd_num;
        return answer;
    }
}