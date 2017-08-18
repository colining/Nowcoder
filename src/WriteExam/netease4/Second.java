package WriteExam.netease4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/9.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            func1(n);
        }
    }

    private static void func1(int n) {
        long start = System.currentTimeMillis();
        Deque<Integer> queue = new LinkedList<>();
        int i = n;
        while (i != 0) {
            queue.addFirst(i);
            queue.addFirst(queue.removeLast());
            i--;
        }
        for (int j = 0; j < n - 1; j++) {
            System.out.print(queue.removeFirst()+ " ");
        }
        System.out.print(queue.removeFirst());
        System.out.println();
//        System.out.println(System.currentTimeMillis() - start+"ms");
    }
}
