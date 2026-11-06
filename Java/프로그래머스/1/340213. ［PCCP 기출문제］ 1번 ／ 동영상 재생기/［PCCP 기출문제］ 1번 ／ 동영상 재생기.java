class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String[] posSplit = pos.split(":");
        int posSecond = Integer.valueOf(posSplit[0]) * 60 + Integer.valueOf(posSplit[1]);
        
        String[] start_second = op_start.split(":");
        int startSecond = Integer.valueOf(start_second[0]) * 60 + Integer.valueOf(start_second[1]);
        
        String[] end_second = op_end.split(":");
        int endSecond = Integer.valueOf(end_second[0]) * 60 + Integer.valueOf(end_second[1]);
        
        String[] lenSplit = video_len.split(":");
        int videoLength = Integer.valueOf(lenSplit[0]) * 60 + Integer.valueOf(lenSplit[1]);
        
        for(String command : commands){

            if(posSecond >= startSecond && posSecond < endSecond){
                posSecond = endSecond;
            }
            
            if(command.equals("prev")){
                posSecond -= 10;
            }
            else if(command.equals("next")){
                posSecond += 10;
            }
            
            if(posSecond >= startSecond && posSecond < endSecond){
                posSecond = endSecond;
            }
            if(videoLength < posSecond){
                posSecond = videoLength;
            }
            if(posSecond < 0){
                posSecond = 0;
            }
        }
        
        String minute = String.valueOf(posSecond / 60);
        String second = String.valueOf(posSecond % 60);
        
        String answer = (minute.length() == 1 ? ("0" + minute) : minute) + ":" + (second.length() == 1 ? ("0" + second) : second);
        
        return answer;
    }
}