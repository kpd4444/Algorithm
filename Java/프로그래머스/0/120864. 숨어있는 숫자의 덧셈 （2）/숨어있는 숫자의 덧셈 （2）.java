class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] string = my_string.split("[A-z]+");
        
        for(String s : string){
            if(!s.equals("")){
                answer += Integer.valueOf(s);
            }
        }
        return answer;
    }
}