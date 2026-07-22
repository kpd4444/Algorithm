class Solution {
    public int solution(String[] order) {
        int price = 0;
        
        for(String s : order){
            if(s.contains("americano")){
                price += 4500;
            }
            else if(s.contains("cafelatte")){
                price += 5000;
            }
            else{
                price += 4500;
            }
        }
        return price;
    }
}