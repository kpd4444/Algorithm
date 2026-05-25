class Solution {
    public int solution(int order) {
        String s = String.valueOf(order);
        int count = 0 ;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '3':
                case '6':
                case '9':
                    count++;
            }
        }
        return count;
    }
}