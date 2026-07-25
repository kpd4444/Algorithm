class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] temp = my_string.split("[+-]");
        int [] numbers = new int[temp.length];
        int idx = 0;
        for(String s : temp){
            numbers[idx++] = Integer.parseInt(s.strip());
        }
        idx = 0;
        answer += numbers[idx++];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == '+'){
                answer += numbers[idx++];
            }
            else if(my_string.charAt(i) == '-'){
                answer -= numbers[idx++];
            }
            
        }
        
        return answer;
    }
}