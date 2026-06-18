import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        for(int i = 0; i < a.length(); i++){
            System.out.println(a.charAt(i));
        }
        input.close();
    }
}