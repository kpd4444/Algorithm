class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i : indices){
            sb.setCharAt(i, 'A');
        }
        String result = sb.toString();
        
        
        return result.replaceAll("A","");
    }
}