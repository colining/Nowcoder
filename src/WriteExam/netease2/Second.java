package WriteExam.netease2;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {


            int n = scanner.nextInt();
            int l = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            func1(a, l);
//            func2(a, l);
        }
    }

//    private static void func2(int[] a, int l) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        int res = 0;
//        priorityQueue.add(a[0]);
//        for (int i = 1; i < a.length; i++) {
//            int temp = priorityQueue.peek();
//            res = Math.max(res, a[i] - temp);
//        }
//    }

    private static void func1(int[] a, int l) {
        Arrays.sort(a);
        int res = 0;
        for (int i = 1; i < a.length; i++) {
            res = Math.max(res, a[i] - a[i - 1]);
        }
        double border = Math.max(a[0], l - a[a.length - 1]);
        if (border > res/2.0) {
            System.out.println(String.format("%.2f", border));
        } else {
            System.out.println(String.format("%.2f", res / 2.0));
        }
    }
}
