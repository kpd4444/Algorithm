class Solution {
    public long solution(String numbers) {
        String [] number = {"zero","one", "two","three","four","five","six","seven","eight","nine"};
        StringBuilder sb = new StringBuilder();
        while(numbers.length() > 2){
            for(int i = 0; i < 10; i++){
                if(numbers.startsWith(number[i])){
                    sb.append(i);
                    numbers = numbers.substring(number[i].length());
                }
            }
        }
        
        
        
        return Long.valueOf(sb.toString());
    }
}