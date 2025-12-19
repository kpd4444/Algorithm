import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 배열의 숫자
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int nextNum = 1;

        boolean possible = true;

        for (int i = 0; i <n; i++) {
            int target = input.nextInt();

            while(nextNum <= target){
                stack.push(nextNum++);
                sb.append("+\n");
            }

            if(!stack.isEmpty() && stack.peek() == target){
                stack.pop();
                sb.append("-\n");
            }
            else{
                System.out.println("NO");
                possible = false;
                break;
            }
        }
        if(possible){
            System.out.println(sb);
        }



        input.close();

    }

}
