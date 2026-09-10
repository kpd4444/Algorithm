class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
    
        for(String b : babbling){
            int before = -1;
            for(int i = 0; i < word.length; i++){
                if(before == i){
                    continue;
                }
                if(b.startsWith(word[i])){
                    before = i;
                    b = b.substring(word[i].length());
                    i = -1;
                }
            }
            System.out.println("b = " + b);
            if(b.isBlank()){
               answer++; 
            }
        }
        return answer;
    }
}