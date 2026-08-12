class Solution {
    public long solution(int price, int money, int count) {
        long fee = 0;
        for(int i = 1; i <= count; i++){
            fee += price*i;
        }
        if(fee > money){
            return fee - money;
        }
        
        return 0;
    }
}