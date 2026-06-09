class Solution {
    public int[] solution(int[] arr, int n) {
        for(int i = 0; i < arr.length; i+=2){
            if(i == 0 && arr.length % 2 == 0){
                i++;
            }    
            arr[i] += n;
        }
        return arr;
    }
}