class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n != 0){
            answer += (n / a) * b;
            int temp = n % a;
            n = (n / a) * b;
            if(n == 0){
                break;
            }
            n += temp;
        }
        return answer;
    }
}