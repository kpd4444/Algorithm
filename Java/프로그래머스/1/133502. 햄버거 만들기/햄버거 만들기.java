class Solution {
    public int solution(int[] ingredient) {

        int[] temp = new int[ingredient.length];
        int answer = 0;
        int idx = 0;
        for(int i : ingredient){
            temp[idx++] = i;
            
            if( idx >= 4 && temp[idx - 4] == 1 && temp[idx - 1] == 1 
               && temp[idx - 3] == 2 && temp[idx - 2] == 3){
                answer++;
                idx -= 4;
            }
        }
        return answer;
    }
}