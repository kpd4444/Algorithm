class Solution {
    public int solution(String binomial) {
        String [] string = binomial.split(" ");
        switch (string[1]){
            case "+":
                return Integer.parseInt(string[0]) + Integer.parseInt(string[2]);
                
            case "-":
                return Integer.parseInt(string[0]) - Integer.parseInt(string[2]);
                
            case "*":
                return Integer.parseInt(string[0]) * Integer.parseInt(string[2]);
                
        }
        return 0;
    }
}