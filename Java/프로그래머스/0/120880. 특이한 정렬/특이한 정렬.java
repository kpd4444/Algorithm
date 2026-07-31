import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Number [] numbers = new Number[numlist.length];
        for(int i =0 ; i < numlist.length; i++){
            numbers[i] = new Number(numlist[i], Math.abs(n - numlist[i]));
        }
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i].value;
        }
        
        return answer;
    }
    static class Number implements Comparable<Number>{
        int value;
        int distance;
        
        public Number(int value, int distance){
            this.value = value;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Number o){
            if(this.distance != o.distance){
                return this.distance - o.distance;
            }
            else{
                return o.value - this.value;
            }
        }
        
    }
}