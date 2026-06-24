class Solution {
    public int solution(int n) {
        int pizzaNum = 1;
        while(!((6 * pizzaNum) % n == 0)){
            pizzaNum++;
        }
        
        return pizzaNum;
    }
}