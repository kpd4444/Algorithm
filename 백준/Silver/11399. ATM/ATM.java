import java.util.*;
import java.io.*; // 1. IO 관련 클래스 임포트

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum =0 ;

        int [] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        Arrays.sort(A);
        int s[] = new int[n];
        s[0] = A[0];
        sum += s[0];
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + A[i];
            sum += s[i];
        }
        System.out.println(sum);

        input.close();
    }



}