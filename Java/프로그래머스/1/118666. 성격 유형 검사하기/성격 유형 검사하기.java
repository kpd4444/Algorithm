import java.util.Arrays;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] types = {"RT", "TR", "CF", "FC", "JM", "MJ", "AN", "NA"};
        int [] points = new int[8];
        
        for(int i = 0; i < survey.length;i++){
            for(int j = 0; j < types.length; j++){
                if(survey[i].equals(types[j])){
                    points[j] += getPoint(choices[i]);
                }
            }
        }
        System.out.println(Arrays.toString(points));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < points.length; i = i + 2){
            int p = points[i] + (-points[i + 1]);
            if(p <= 0){
                sb.append(types[i].charAt(0));
            }
            else{
                sb.append(types[i].charAt(1));
            }
        }
        
        return sb.toString();
    }
    
    private int getPoint(int choice){
        int point = 0;
        if(choice <= 3){
            point -= (4 - choice);
        }
        else if(choice >= 5){
            point += (choice - 4);
        }
        return point;
    }
}