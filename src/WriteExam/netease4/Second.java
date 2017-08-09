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
        Deque<Integer> queue = new LinkedList<>();
        int i = n;
        while (i != 0) {
            queue.offerFirst(i);
            queue.offerFirst(queue.pollLast());
            i--;
        }
        while (queue.size() != 0) {
            System.out.print(queue.pollFirst());
            if (queue.size() != 0) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
