class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        for(String s : quiz){
            String [] split = s.split(" = ");
            
            if(split[0].contains("+")){
                String [] question = split[0].split(" \\+ ");
                
                if(Integer.parseInt(question[0]) + Integer.parseInt(question[1]) 
                   == Integer.parseInt(split[1])){
                       answer[idx++] = "O";
                   }
                else{
                    answer[idx++] = "X";
                }
                
            }else{
                String [] question = split[0].split(" - ");
                
                if(Integer.parseInt(question[0]) - Integer.parseInt(question[1]) 
                   == Integer.parseInt(split[1])){
                       answer[idx++] = "O";
                   }
                else{
                    answer[idx++] = "X";
                }
            }
            
        }
        
        
        return answer;
    }
}