import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //데이터 갯수
        int m = input.nextInt(); //질의 응답 갯수

        int []a = new int[n + 1];
        int []s = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            s[i] = s[i-1] +a[i];
        }
        
        for (int i = 1; i <= m; i++) {
            int first = input.nextInt();
            int end = input.nextInt();

            System.out.println(s[end] - s[first -1]);
        }

        input.close();

    }
}
