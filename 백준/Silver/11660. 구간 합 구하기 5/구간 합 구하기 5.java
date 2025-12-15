import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //데이터 갯수
        int m = input.nextInt(); //질의 응답 갯수

        int [][]a = new int[n + 1][n + 1];
        int [][]s = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = input.nextInt();
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + a[i][j];
            }
        }



        for (int i = 1; i <= m; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            int result = s[x2][y2] -s[x2][y1-1]-s[x1-1][y2] +s[x1-1][y1-1];
            System.out.println(result);
        }



        input.close();

    }
}
