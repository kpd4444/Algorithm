class Solution {
    public int solution(int a, int b) {
        b /= gcd(a,b);
        int result = 1;
        for(int i = 2; i <= b; i++){
            while(b % i ==0){
                b /= i;
                if(i != 2 && i != 5){
                    result = 2;
                    break;
                }
            }
            
        }
        
        return result;
    }
    
    int gcd(int a , int b){
        while(b!= 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}