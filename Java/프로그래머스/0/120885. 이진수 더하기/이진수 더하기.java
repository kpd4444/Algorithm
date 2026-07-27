class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = 0;
        int num2 = 0;
        
        int temp = 1;
        for(int i = 0; i < bin1.length(); i++){
            num1 += (temp * (bin1.charAt(bin1.length() - i - 1) - '0'));
            temp *= 2;
        }
        temp = 1;
        for(int i = 0; i < bin2.length(); i++){
            num2 += (temp * (bin2.charAt(bin2.length() - i - 1) - '0' ));
            temp *= 2;
        }
        
        
        return Integer.toBinaryString(num1 + num2);
    }
}