class Solution {
    public int[] solution(int[] arr, int k) {
        int idx = 0;
        if(k % 2 !=0){
            for(int i: arr){
            arr[idx] *= k;  
            idx++;
            }
        }
        else{
            for(int i: arr){
            arr[idx] += k;  
            idx++;
            }
        }
        
        return arr;
    }
}