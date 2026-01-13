import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            String s = input.next();
            if(s.equals("0")){
                break;
            }
            int n = s.length() /2;
            int end = s.length();
            int start = 0;
            boolean result = true;
            for (int i = 0; i < n; i++) {
                if(s.charAt(start++)-'0' != s.charAt(--end) -'0'){
                    result = false;
                    break;
                }
            }
            if(result){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }

        input.close();
    }
}