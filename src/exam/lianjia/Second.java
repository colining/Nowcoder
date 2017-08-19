package exam.lianjia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/19.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int n2 = scanner.nextInt();
            int[] q = new int[n2];
            for (int i = 0; i < n2; i++) {
                q[i] = scanner.nextInt();
            }
            func(a, q);
        }
    }

    private static void func(int[] a, int[] q) {

        int[] helper = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            helper[i] = a[i] + (i == 0 ? 0 : helper[i - 1]);
        }
        for (int i = 0; i < q.length; i++) {
            int x = Arrays.binarySearch(helper, q[i]);
            System.out.println(x<0? -x:x+1);
        }

    }
}

