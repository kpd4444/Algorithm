import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //재료의 갯수

        int [] sizes = new int[6];

        for (int i = 0; i < 6; i++) {
            sizes[i] = input.nextInt();
        }

        int t = input.nextInt(); //티셔츠 묶음 수
        int p = input.nextInt(); // 펜의 묶음 수

        int t_shirts_count = 0;

        for (int i = 0; i < 6; i++) {
            if(sizes[i]%t ==0 ){
                t_shirts_count += sizes[i]/t;
            }
            else{
                t_shirts_count += (sizes[i]/t +1);
            }
        }

        System.out.println(t_shirts_count);
        System.out.println(n/p + " "+ n%p);

        input.close();

    }
}
