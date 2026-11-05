

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = 50;
        answer[1] = 50;
        answer[2] = 0;
        answer[3] = 0;
        
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                char c = wallpaper[i].charAt(j);
                if(c == '#'){
                        if(i < answer[0]){
                            answer[0] = i;
                        }
                        if(j < answer[1]){
                            answer[1] = j;
                        }
                        if(i + 1 > answer[2]){
                            answer[2] = i + 1;
                        }
                        if(j + 1 > answer[3]){
                            answer[3] = j + 1;
                        }
                    }
            }
        }
        return answer;
    }
}