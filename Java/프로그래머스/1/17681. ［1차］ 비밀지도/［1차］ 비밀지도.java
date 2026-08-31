class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0 ; i < n ; i++){
            int n1 = arr1[i];
            int n2 = arr2[i];
            
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            
            while(n1 > 0){
                sb1.append(n1 % 2);
                n1 /= 2;
            }
            while(n2 > 0){
                sb2.append(n2 % 2);
                n2 /= 2;
            }
            while(sb1.length() < n){
                sb1.append("0");
            }
            while(sb2.length() < n){
                sb2.append("0");
            }
            sb1.reverse();
            sb2.reverse();
            
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append((sb1.charAt(j) - '0') | (sb2.charAt(j) - '0'));
            }
            answer[i] = sb.toString().replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}