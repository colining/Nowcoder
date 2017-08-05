package exam;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Astar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monster = scanner.nextInt();
        int[] a = new int[monster];
        int[] b = new int[monster];
        int skill = scanner.nextInt();
        int[] c = new int[skill];
        int[] d = new int[skill];
        for (int i = 0; i < monster; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < skill; i++) {
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }

        System.out.println(func2(a, b, c, d));
    }

    private static int func2(int[] a, int[] b, int[] c, int[] d) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            priorityQueue = new PriorityQueue<Integer>();
            int min = findMin(a, b, c, d,i,0);
            if (min == 0) {
                return -1;
            }
            sum += min;
            priorityQueue = null;
        }
        return sum;
    }

    public static PriorityQueue<Integer> priorityQueue;
    private static int findMin(int[] a, int[] b, int[] c, int[] d, int i,int min) {
        if (a[i] <= 0) {
            priorityQueue.add(min);
            return 0;
        }
        int temp = a[i];
        for (int j = 0; j < c.length; j++) {
            if ( d[j] > b[i]) {
                a[i] = a[i] + b[i] - d[j];
                min += c[j];
                findMin(a, b, c, d, i,min);
            }
            a[i] = temp;
            min -= c[j];
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();
    }
}
