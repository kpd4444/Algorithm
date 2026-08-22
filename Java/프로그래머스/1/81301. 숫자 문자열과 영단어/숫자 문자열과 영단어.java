class Solution {
    public int solution(String s) {
        String [] numbers = {"zero", "one" , "two", "three",
                    "four","five", "six","seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            boolean check = false;
            for(int i = 0; i < 10; i++){
                if(s.startsWith(numbers[i])){
                    sb.append(i);
                    s = s.substring(numbers[i].length());
                    check = true;
                    break;
                }
            }    
            if(check){
                continue;
            }
            sb.append(s.charAt(0));
            s = s.substring(1);
        }
        return Integer.valueOf(sb.toString());
    }
}