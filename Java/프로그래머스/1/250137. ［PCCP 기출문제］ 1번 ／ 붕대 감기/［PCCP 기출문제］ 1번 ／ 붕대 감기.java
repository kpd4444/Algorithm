class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
    
        int maxHealth = health;
        
        int attackIndex = 0;
        int bonusCount = 0;
        
        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++){
            if(i == attacks[attackIndex][0]){
                health -= attacks[attackIndex][1];
                if(health <= 0){
                    return -1;
                }
                attackIndex++;
                bonusCount = 0;
            }    
            else{
                bonusCount++;
                health += bandage[1];
                if(bonusCount == bandage[0]){
                    health += bandage[2];
                    bonusCount = 0;
                }
                if(health > maxHealth){
                    health = maxHealth;
                }
            }
            System.out.println(health);
        }
        return health;
    }
}