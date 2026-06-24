class Solution {
    public String solution(int age) {
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
        String s = String.valueOf(age);
        
        String result ="";
        
        for(int i = 0; i < s.length(); i++){
            result += (alpha[s.charAt(i) - '0']);
        }
        
        return result;
    }
}