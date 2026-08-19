class Solution {
    public int solution(int n) {

        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            sb.append(n % 3);
            n /= 3;
        }
        int answer = 0;
        int temp = 1;
        for(int i = sb.length() - 1; i >= 0 ; i--){
            int value = sb.charAt(i) - '0';
            answer += temp*value;
            temp *= 3;
        }
        
        return answer;
    }
}