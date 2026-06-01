class Solution {
    public int solution(int num, int k) {
        int result = -1;
        
        char[] array = String.valueOf(num).toCharArray();
        for(int i = 0; i < array.length; i++){
            if(k == array[i] - '0'){
                result = i + 1;
                break;
            }
        }
        return result;
    }
}