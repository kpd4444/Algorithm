import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c =(char)( c + (int)('a' - 'A'));
                sb.append(c);
            }
            else{
                if(c >= 'a' && c <= 'z'){
                c = (char)(c - ('a' - 'A'));
                sb.append(c);
            }
            }
        }
        
        System.out.println(sb.toString());
        input.close();
    }
}