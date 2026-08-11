class Solution {
    boolean solution(String s) {
        
        String temp = s.toLowerCase();
        int pNum=0;
        int yNum=0;
        for(int i = 0; i < temp.length(); i++){
            char c = temp.charAt(i);
            if(c == 'p'){
                pNum++;
            }
            else if(c == 'y'){
                yNum++;
            }
        }
      
        if(pNum == yNum){
            return true;
        }
        
        return false;
    }
}