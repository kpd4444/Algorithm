class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int []answer = new int[queries.length];
        
        for(int j = 0; j < queries.length; j++){
            int min = 1000001;
            for(int i = 0; i < arr.length; i++){
                if(queries[j][0] <= i && i <= queries[j][1] 
                    && queries[j][2] < arr[i] && arr[i] < min){
                    min = arr[i];
                    answer[j] = min;
                }
            }
            if(min == 1000001){
                answer[j] = -1;
            }
        }
        
        return answer;
    }
}