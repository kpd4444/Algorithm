class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                if((char)(c + n) <= 'Z'){
                    sb.append((char)(c + n));
                }
                else{
                    sb.append((char)(c + n - 26));
                }
            }
            else if(Character.isLowerCase(c)){
                if((char)(c + n) <= 'z'){
                    sb.append((char)(c + n));
                }
                else{
                    sb.append((char)(c + n - 26));
                }
            }
            else{
                sb.append(c);
            }
            
        }
        
        return sb.toString();
    }
}