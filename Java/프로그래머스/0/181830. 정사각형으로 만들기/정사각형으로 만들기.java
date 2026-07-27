class Solution {
    public int[][] solution(int[][] arr) {
        int [][] answer = {};
        if(arr.length > arr[0].length){
            answer = new int[arr.length][arr.length];
            copyOfArray(answer, arr);
        }
        else if(arr.length == arr[0].length){
            return arr;
        }
        else{
            answer = new int[arr[0].length][arr[0].length];
            copyOfArray(answer, arr);
        }
        return answer;
    }
    
    private void copyOfArray(int [][] answer, int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                answer[i][j] = arr[i][j]; 
            }
        }
    }
}