class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){
                answer[my_string.charAt(i) - 'A']++;
            }
            else{
                answer[my_string.charAt(i) - 'A' - 6]++;
            }
        }
        return answer;
    }
}