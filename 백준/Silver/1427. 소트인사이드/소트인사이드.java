import java.util.*;
import java.io.*; // 1. IO 관련 클래스 임포트

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String s = input.next();

        int [] numbers = new int[s.length()];
        for (int i = 0; i <s.length(); i++) {
            numbers[i] = s.charAt(i) -'0';
        }

        Arrays.sort(numbers);
        for (int i = s.length()-1; i >=0; i--) {
            System.out.print(numbers[i]);
        }

        input.close();
    }



}