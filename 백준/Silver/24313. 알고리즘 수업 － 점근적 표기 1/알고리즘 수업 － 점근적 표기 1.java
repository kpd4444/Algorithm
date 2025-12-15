    import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int a1 = input.nextInt();
            int a0 = input.nextInt();

            int c = input.nextInt();
            int n = input.nextInt();

            if(a1 * n + a0 <= n * c && a1<= c){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }

            input.close();
        }
    }