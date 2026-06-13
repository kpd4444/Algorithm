class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(String s : strArr){
            if(!s.contains("ad")){
                count++;
            }
        }
        String[] answer = new String[count];
        
        int index = 0;
        for(String s : strArr){
            if(!s.contains("ad")){
                answer[index++] = s;
            }
        }
        
        
        return answer;
    }
}