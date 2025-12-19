import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 배열의 숫자
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Character> queue = new ArrayDeque<>();

        int topPoint = 0;


        boolean result = true;

        for (int i = 1; i <= n; i++) {
            int data = input.nextInt();

            while(topPoint < data){
                stack.push(++topPoint);
                queue.add('+');
            }

            while(!stack.isEmpty()){

                if(stack.pop() == data){
                    queue.add('-');
                    break;
                }
                if(stack.peek() + 1 > data){
                    result = false;
                    break;
                }

            }
            if(result == false){
                break;
            }

        }
        if(result){
            for (Character c : queue) {
                System.out.println(c);
            }
        }
        else{
            System.out.println("NO");
        }

        input.close();

    }

}
