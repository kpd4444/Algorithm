import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String parentheses;

        for (int i = 0; i < n; i++) {
            parentheses = input.next();
            if(check(parentheses)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean check(String parentheses) {
        Stack<Character> stack = new Stack<>();

        int n = parentheses.length();

        char c,k;

        for (int i = 0; i < n; i++) {
            c = parentheses.charAt(i);
            //System.out.println("c = "+ c);
            if(c == '('){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()){
                    k = stack.peek();
                    if(k=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }

            }
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}