import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 입력 속도 향상
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. 출력 속도 향상
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 줄 입력 (N, L)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        // 둘째 줄 입력 (숫자 데이터들)
        st = new StringTokenizer(br.readLine());

        Deque<Node> deque = new ArrayDeque<>();
        
        // 1. 첫 번째 데이터 처리
        Node node = new Node(1, Integer.parseInt(st.nextToken()));
        deque.addLast(node);
        bw.write(node.value + " "); // print -> write

        // 2. 윈도우 크기(L)가 채워질 때까지 (2 ~ L)
        // 주의: N이 L보다 작을 경우를 대비해 i <= n 조건도 추가하면 더 안전함 (문제 조건상 N>=L이면 상관없음)
        for (int i = 2; i <= l && i <= n; i++) {
            Node insert = new Node(i, Integer.parseInt(st.nextToken()));
            
            while (!deque.isEmpty() && deque.peekLast().value >= insert.value) {
                deque.removeLast();
            }
            deque.addLast(insert);
            bw.write(deque.peekFirst().value + " ");
        }

        // 3. 윈도우가 슬라이딩 시작하는 구간 (L+1 ~ N)
        for (int i = l + 1; i <= n; i++) {
            // 맨 앞의 값이 윈도우 범위를 벗어났는지 확인
            if (deque.peekFirst().index <= i - l) {
                deque.removeFirst();
            }
            
            Node insert = new Node(i, Integer.parseInt(st.nextToken()));
            
            while (!deque.isEmpty() && deque.peekLast().value >= insert.value) {
                deque.removeLast();
            }
            deque.addLast(insert);
            bw.write(deque.peekFirst().value + " ");
        }
        
        // 4. 출력 버퍼 비우기 (필수!)
        bw.flush();
        bw.close();
        br.close();
    }

    static class Node {
        public int index;
        public int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}