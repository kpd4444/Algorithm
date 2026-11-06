class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        for(int i = 0; i < new_id.length(); i++){
            char c = new_id.charAt(i);
            if(c != '-' && c != '_' && c != '.' && !Character.isDigit(c) && 
               !((c >= 'a') && (c <= 'z'))) {
                new_id = new_id.replace(String.valueOf(c), " ");
            }
        }
        new_id = new_id.replace(" ", "");
        //3단계
        while(new_id.contains("..")){
            new_id = new_id.replace("..", ".");
        }
        //4단계
        
        if(new_id.charAt(0) == '.'){
            new_id = new_id.substring(1);
        }
        if(new_id.length() - 1 >= 0 && new_id.charAt(new_id.length() - 1) == '.'){
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        //5단계
        if(new_id.length() == 0){
            new_id += "a";
        }
        
        //6단계
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            if(new_id.charAt(new_id.length() - 1) == '.'){
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        //7단계
        if(new_id.length() <= 2){
            char c = new_id.charAt(new_id.length() - 1);
            int n = new_id.length();
            for(int i = 0; i < 3 - n; i++){
                new_id += c;
            }
        }
        
        return new_id;
    }
}