class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.length() - is_suffix.length() >=0){
            return my_string.substring(my_string.length() - is_suffix.length(),my_string.length()).equals(is_suffix)
            ? 1 : 0;
        }
        else{
            return 0;
        }
        
    }
}