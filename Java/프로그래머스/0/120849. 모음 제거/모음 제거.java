class Solution {
    public String solution(String my_string) {
        char [] array = {'a','e','i','o','u'};
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++){
            boolean res = false;
            for(int j=0;j<5;j++){
                if(my_string.charAt(i) == array[j]){
                    res = true;
                    continue;
                }
            }
            if(res == false){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}