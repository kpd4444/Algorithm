class Solution {
    public int solution(int n) {
        //20이면 1,20 2,10 4,5 5,4 10,2 20,1
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }
}