import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{
           int first_abs = Math.abs(o1);
           int second_abs = Math.abs(o2);

           if(first_abs == second_abs){
               return o1> o2 ? 1 : -1;
           }
           else{
               return first_abs - second_abs;
           }
        });
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();

            if(x == 0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(pq.poll());
                }
            }
            else{
                pq.add(x);
            }
        }



        input.close();
    }
}