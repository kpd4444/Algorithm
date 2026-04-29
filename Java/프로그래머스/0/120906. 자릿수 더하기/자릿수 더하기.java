class Solution {
    public int solution(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) - '0');
        }
        
        return sum;
    }
}