class Solution {
    public String solution(String my_string, String alp) {
        char[] array = my_string.toCharArray();
        for(int i = 0; i < array.length; i++){
            if (array[i] == alp.charAt(0)){
                array[i] = (char)(array[i] - ('a' - 'A'));
            }
        }
            
            
        return String.valueOf(array);
    }
}