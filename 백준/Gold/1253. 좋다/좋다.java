import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //재료의 갯수

        int []s = new int[n];
        //일단 2개를 합쳐서 m이 되는게 몇개인지 판단해야함
        for (int i = 0; i < n; i++) {
            s[i] = input.nextInt();
        }
        Arrays.sort(s);

        int count = 0;

        for (int i = 0; i < s.length; i++) {
            int m = s[i];
            int start = 0;
            int end = n-1;
            while(start < end){
                int current = s[start] + s[end];
                if(start == i ){
                    start++;
                    continue;
                }
                if(end == i ){
                    end--;
                    continue;
                }

                if(current < m){
                    start++;
                }
                else if (current > m){
                    end--;
                }
                else{
                    count++;
                    break;
                }
            }
        }


        System.out.println(count);
        input.close();

    }
}
