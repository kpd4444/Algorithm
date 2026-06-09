class Solution {
    public int solution(int n, String control) {
        int result = n;
        for(int i = 0; i < control.length();i++){
            char c = control.charAt(i);
            switch (c){
                case 'w':
                    result++;
                    break;
                case 's':
                    result--;
                    break;
                case 'd':
                    result+=10;
                    break;
                case 'a':
                    result-=10;
                    break;
                default :
                    break;
            }
        }
        return result;
    }
}