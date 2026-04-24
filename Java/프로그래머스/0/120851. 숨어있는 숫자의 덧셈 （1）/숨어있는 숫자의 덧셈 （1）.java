class Solution {
    public int solution(String my_string) {
        int n = my_string.length();
        
        int sum=0;
        
        for(int i=0; i<n;i++){
            int c = my_string.charAt(i) - '0';
            if(c>=1 && c<=9){
                sum+=c;
            }
        }
        return sum;
    }
}