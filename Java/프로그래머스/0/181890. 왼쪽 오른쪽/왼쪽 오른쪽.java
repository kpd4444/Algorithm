import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        List <String> list = new ArrayList<>();
        boolean flag = true;
        boolean isLeftRight = false;
        for(String s : str_list){
            if(flag){
                switch (s){
                case "u":
                    list.add("u");
                    break;
                case "d":
                    list.add("d");
                    break;
                case "l":
                    isLeftRight = true;
                    return list.toArray(String[]::new);
                    
                case "r":
                    list.clear();
                    isLeftRight = true;
                    flag = false;
                    break;
                }
            }
            
            else{
                list.add(s);
            }
        }
        if(!isLeftRight){
            list.clear();
        }
        
        
        return list.toArray(String[]::new);
    }
}