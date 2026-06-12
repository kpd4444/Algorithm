class Solution {
    public int solution(String myString, String pat) {
        char [] charArray = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++){
            if(charArray[i] == 'A'){
                charArray[i] = 'B';
            }
            else if(charArray[i] == 'B'){
                charArray[i] = 'A';
            }
        }
        if(String.valueOf(charArray).contains(pat)){
            return 1;
        }
        else{
            return 0;
        }
    }
}