class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int n = park.length;
        int m = park[0].length();
        
        int[] dc = {1, 0, -1, 0};
        int[] dr = {0, 1, 0, -1};
        
        int[] start = getStart(park);
        int r = start[0];
        int c = start[1];
        

        
        for(String route : routes){
            String[] split = route.split(" ");
            int index = getIndex(split[0]);
            int distance = Integer.parseInt(split[1]);
            
            System.out.println(index + "  " + distance);
            
            int mode = 0;
            int cr = r;
            int cc = c;
            for(int i = 0; i < distance; i++){
                int nr = r + dr[index];
                int nc = c + dc[index];
                
                if(nr < 0 || nr >= n || nc < 0 || nc >= m){
                    mode = 1;
                    break;
                }
                if(park[nr].charAt(nc) == 'X'){
                    mode = 1;
                    break;
                }
                r = nr;
                c = nc;
            }
            if(mode == 1){
                r = cr;
                c = cc;
            }
            
        }
        answer[0] = r;
        answer[1] = c;
        
        return answer;
    }
    private int getIndex(String route){
        switch(route){
            case "E":
                return 0;
            case "S":
                return 1;
            case "W":
                return 2;
            case "N":
                return 3;
        }
        return -1;
    }
    private int[] getStart(String[] park){
        for(int i = 0; i < park.length; i++){
            if(!park[i].contains("S")){
                continue;
            }
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}