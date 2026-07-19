class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] alpha = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            
        String [] letters = letter.split(" ");
        for(String l: letters){
            int count = 0;
            for(String a : alpha){
                if(l.equals(a)){
                    char c = (char)('a' + count);
                 
                    sb.append(c);
                }
                count++;
            }
        }
        
        return sb.toString();
    }
}