class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "Yes";
        
        int c1 = 0;
        int c2 = 0;
        
        for(String g : goal){
            if(c1 < cards1.length && g.equals(cards1[c1])){
                c1++;
                continue;
            }
            else if(c2 < cards2.length && g.equals(cards2[c2])){
                c2++;
                continue;
            }
            else{
                result = "No";
            }
        }

        return result;
    }
}