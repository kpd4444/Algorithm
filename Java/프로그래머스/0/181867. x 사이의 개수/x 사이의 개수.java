class Solution {
    public int[] solution(String myString) {
        String []string = myString.split("x");
        int n = myString.length() == (myString.lastIndexOf("x") + 1) ? string.length + 1 : string.length;
        int []answer = new int[n];
        for(int i = 0; i< string.length;i++){
            answer[i] = string[i].length();
        }
        
        
        return answer;
    }
}