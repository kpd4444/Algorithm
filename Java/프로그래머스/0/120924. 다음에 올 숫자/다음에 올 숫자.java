class Solution {
    public int solution(int[] common) {
        //등차 수열인지
        boolean ap = (common[1] - common[0]) == (common[2] - common[1]) ? true : false; 
        int result = 0;
        // 등차수열이라면
        if(ap){
            result = common[common.length - 1] + common[1] - common[0];
        }
        // 등비수열 이라면
        else{
            result = common[common.length - 1] * (common[1] / common[0]);
        }
        
        
        
        
        return result;
    }
}