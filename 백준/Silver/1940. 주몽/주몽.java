import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //재료의 갯수
        int m = input.nextInt(); //갑옷을 만드는데 필요한 수

        int []s = new int[n];

        //일단 2개를 합쳐서 m이 되는게 몇개인지 판단해야함
        for (int i = 0; i < n; i++) {
            s[i] = input.nextInt();
        }
        Arrays.sort(s);

        int start = 0;
        int end = n-1;

        int count = 0;
        while(start < end){
            int current = s[start] + s[end];

            if(current < m){
                start++;
            }
            else if (current > m){
                end--;
            }
            else{
                count++;
                start++;
            }
        }

        System.out.println(count);

        input.close();
    }
}
