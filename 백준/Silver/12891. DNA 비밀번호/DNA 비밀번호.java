import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 문자열 길이
        int k = input.nextInt(); // 부분 문자열의 길이

        int []dnaNum = new int[4];
        int count =0;

        String s = input.next();

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            switch (c){
                case 'A':
                    dnaNum[0]++;
                    break;
                case 'C':
                    dnaNum[1]++;
                    break;
                case 'G':
                    dnaNum[2]++;
                    break;
                case 'T':
                    dnaNum[3]++;
                    break;
            }
        }
        int [] testNum = new int[4];
        count++;
        for (int i = 0; i < 4; i++) {
            testNum[i] = input.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if(dnaNum[i] < testNum[i]){
                count--;
                break;
            }
        }

        for (int i = k; i < n; i++) {
            char c = s.charAt(i);
            switch (c){
                case 'A':
                    dnaNum[0]++;
                    break;
                case 'C':
                    dnaNum[1]++;
                    break;
                case 'G':
                    dnaNum[2]++;
                    break;
                case 'T':
                    dnaNum[3]++;
                    break;
            }
            c = s.charAt(i-k);
            switch (c){
                case 'A':
                    dnaNum[0]--;
                    break;
                case 'C':
                    dnaNum[1]--;
                    break;
                case 'G':
                    dnaNum[2]--;
                    break;
                case 'T':
                    dnaNum[3]--;
                    break;
            }
            count++;
            for (int j = 0; j < 4; j++) {
                if(dnaNum[j] < testNum[j]){
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
        input.close();

    }
}
