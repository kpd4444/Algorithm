class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int bunmo = denom1 * denom2;
        int bunja = numer1 * denom2 + numer2 * denom1;
        
        answer[0] = bunja / gcd(bunmo,bunja);
        answer[1] = bunmo / gcd(bunmo,bunja);
        
        return answer;
    }
    
    private int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}