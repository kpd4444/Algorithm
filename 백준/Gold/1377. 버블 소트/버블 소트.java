import java.util.*;
import java.io.*; // 1. IO 관련 클래스 임포트

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Data[] data = new Data[n];

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            data[i] = new Data(i + 1,val);
        }

        Arrays.sort(data);

        int max = 0;

        for (int i = 0; i <n ; i++) {
            if(data[i].index - (i+1) >max){
                max = data[i].index - (i+1);
            }

        }
        System.out.println(max + 1);
    }

    static class Data implements Comparable<Data>{
        int index;
        int data;

        public Data(int index, int data) {
            this.index = index;
            this.data = data;
        }

        @Override
        public int compareTo(Data o) {
            return this.data - o.data;
        }
    }


}