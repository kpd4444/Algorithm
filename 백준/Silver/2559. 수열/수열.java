import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 전체 배열의 갯수
        int k = input.nextInt(); // window size의 갯수

        int []s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = input.nextInt();
        }

        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += s[i];
        }

        int maxSum = currentSum;
        for (int i = k; i < n; i++) {
            currentSum += s[i];
            currentSum -= s[i-k];
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);

        input.close();

    }
}
