
class Solution {
    public int[] solution(int[] arr) {
        
        int startIndex = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                startIndex = i;
                break;
            }
        }
        if(startIndex == arr.length){
            int [] answer = {-1};
            return answer;
        }
        int lastIndex = -1;
        for(int i = arr.length - 1; i >=0; i--){
            if(arr[i] == 2){
                lastIndex = i;
                break;
            }
        }
        if(startIndex == lastIndex){
            int[] answer = {2};
            return answer;
        }
        
        int [] answer = new int[lastIndex - startIndex + 1];
        int idx = 0;
        for(int i = startIndex; i <= lastIndex; i++){
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}