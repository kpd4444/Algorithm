class Solution {
    public int solution(int[][] signals) {
        int max = 1;
        for(int[] signal : signals){
            max = lcm(max, signal[0] + signal[1] + signal[2]);
        }
        for(int i = 1; i <= max; i++){
            boolean allYellow = true;
            
            for(int[] signal : signals){
                int g = signal[0];
                int y = signal[1];
                int cycle = g + y + signal[2];
                
                int pos = (i - 1) % cycle;
                
                if(pos < g || pos >= g + y){
                    allYellow = false;
                    break;
                }
            }
            
            if(allYellow){
                return i;
            }
        }
        return -1;
    }
    private int lcm(int a, int b){
        return (a / gcd(a,b)) * b;
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