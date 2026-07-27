class Solution {
    public int solution(int[] sides) {
        int big;
        int small;
        if(sides[0] > sides[1]){
            big = sides[0];
            small = sides[1];
        }
        else{
            big = sides[1];
            small = sides[0];
        }
        int count = 0;
        int i = big;
        while(i + small > big){
            count++;
            i--;
        }
        i = big + 1;
        while(small + big > i){
            count++;
            i++;
        }
        return count;
    }
}