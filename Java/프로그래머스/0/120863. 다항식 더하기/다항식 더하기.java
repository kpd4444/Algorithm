class Solution {
    public String solution(String polynomial) {
        String [] split = polynomial.split(" \\+ ");
        int cons = 0;
        int x = 0;
        
        for(String s : split){
            if(!s.contains("x")){
                cons += Integer.valueOf(s);
            }
            else{
                if(s.length() == 1){
                    x++;
                }
                else{
                    x += Integer.valueOf(s.substring(0, s.length() - 1));
                }
            }
        }
        
        
        String result = (x != 0 ? (x == 1 ? "x" :  x +"x")  : "") + 
            (cons != 0 ? (x == 0 ? cons : " + " + cons) : "");
        
        return result;
    }
}