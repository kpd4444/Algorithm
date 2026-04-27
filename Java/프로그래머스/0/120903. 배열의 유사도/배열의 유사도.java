class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for(String i : s1){
            for(String j : s2){
                if(i.equals(j)){
                    count++; 
                }
            }
        }
        return count;
    }
}