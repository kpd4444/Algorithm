class Solution {
    public int solution(String A, String B) {
        
        if(A.equals(B)){
            return 0;
        }
        int count = 0;
        for(int i = 0 ; i < A.length() -1 ; i++){
            A = A.substring(A.length() - 1) + A.substring(0, A.length() -1);
            count++;
            if(A.equals(B)){
                return count;
            }
        }
        return -1;
    }
}