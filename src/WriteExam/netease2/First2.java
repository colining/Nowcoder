package WriteExam.netease2;

/**
 * Created by colin on 2017/8/8.
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class First2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int avg = scanner.nextInt();
            int[] a = new int[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
            }
            func1(n, r, avg, a, b);
        }
    }

    public static void func1(int n, int r, int avg, int[] a, long[] b) {
        PriorityQueue<Soccer> priorityQueue = new PriorityQueue<Soccer>(n, new Comparator<Soccer>() {
            @Override
            public int compare(Soccer o1, Soccer o2) {
                if (o1.b == o2.b) {
                    return 0;
                }
                return o1.b > o2.b ? 1 : -1;
            }
        });
        int curSoccer = 0;
        for (int i = 0; i < n; i++) {
            Soccer Soccer = new Soccer(a[i], b[i]);
            curSoccer += a[i];
            priorityQueue.add(Soccer);
        }
        long result = 0;
        while (!priorityQueue.isEmpty() && curSoccer < avg * n) {
            Soccer Soccer = priorityQueue.remove();
            int need = avg * n - curSoccer;
            if (need >= r - Soccer.a) {
                result += (r - Soccer.a) * Soccer.b;
                curSoccer += r - Soccer.a;
            } else {
                result += need * Soccer.b;
                curSoccer += need;
            }
        }
        System.out.println(result);
    }

    public static class Soccer {
        int a;
        long b;

        public Soccer(int a, long b) {
            this.a = a;
            this.b = b;
        }
    }
}
