class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length % n == 0 ? num_list.length/n : num_list.length/n +1;
        int [] result = new int[size];
        
        int idx = 0;
        for(int i = 0; i < num_list.length; i+=n){
            result[idx++] = num_list[i]; 
        }
        
        return result;
    }
}