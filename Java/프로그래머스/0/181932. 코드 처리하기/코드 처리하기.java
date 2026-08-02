class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder(); 
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            if(c == '1'){
                mode = (mode == 1) ? 0 : 1;
            }
            else{
                if(mode == 0 && i % 2 == 0){
                    sb.append(c);
                }
                else if(mode == 1 && i % 2 != 0){
                    sb.append(c);
                }
            }
                
        }
        
        if(sb.isEmpty()){
            return "EMPTY";
        }
        
        return sb.toString();
    }
}