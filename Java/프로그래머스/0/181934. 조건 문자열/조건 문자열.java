class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String plus = ineq + eq;
        switch(plus){
            case ">=":
                return n >= m ? 1 : 0;
            case "<=":
                return n <= m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
        }
        return 0;
    }
}