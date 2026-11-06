class Solution {
    public String solution(String polynomial) {
        String[] split = polynomial.split(" \\+ ");
        int x = 0;
        int c = 0;
        
        for(String s : split){
            if(s.contains("x")){
                if(s.length() == 1){
                    x += 1;
                }
                else{
                    s = s.substring(0, s.length() - 1);
                    x += Integer.valueOf(s);
                }
            }
            else{
                c += Integer.valueOf(s);  
            }
        }
        
        if(x == 0){
            return String.valueOf(c);
        }
        else if(c == 0){
            return x == 1 ? "x" : String.valueOf(x) + "x";
        }
        
        
        return (x == 1 ? "" : String.valueOf(x)) + "x + " + String.valueOf(c); 
    }
}