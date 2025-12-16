import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 0;

        while(end<= n && start <= end){
            if(sum < n){
                end++;
                sum += end;
            }
            else if(sum > n){
                sum -= start++;
            }
            else {
                count++;
                sum -= start++;
            }
        }
        System.out.println(count);


        input.close();

    }
}
