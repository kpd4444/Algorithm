import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 입력 갯수
        int m = input.nextInt(); // 나누는 값

        long [] s = new long[n+1];
        long [] a = new long[n+1];
        long [] c = new long[m];
        long count = 0;

        for (int i = 1; i <= n; i++) {
            a[i] = input.nextInt();
            s[i] = s[i-1] + a[i];
        }
        for (int i = 1; i <= n; i++) {
            s[i] = s[i] % m;
            if(s[i] == 0){
                count++;
            }
            c[(int)s[i]]++;
        }
        for (int i = 0; i < m; i++) {
            if(c[i] > 1){
                count += (c[i] *(c[i] - 1)/2);
            }
        }

        System.out.println(count);
        input.close();

    }
}
