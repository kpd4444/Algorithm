import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int [] array = new int[s.length()];
        int idx = 0;
        while(n > 0){
            array[idx++] = (int)(n % 10);
            n = n / 10;
        }
        Arrays.sort(array);
        for(int i = s.length() - 1; i >=0 ; i--){
            sb.append(array[i]);
        }
        
        return Long.valueOf(sb.toString());
    }
}