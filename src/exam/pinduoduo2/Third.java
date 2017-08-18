package exam.pinduoduo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/10.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int[] w = new int[m];
            for (int i = 0; i < m; i++) {
                w[i] = scanner.nextInt();
            }
            func1(h, w);
        }
    }
    /*
    w 巧克力
    h 小孩
     */
    private static void func1(int[] child, int[] chocolate) {
        Arrays.sort(child);
        Arrays.sort(chocolate);
        int res = 0;
        for (int i = 0; i < chocolate.length; i++) {
            for (int j = child.length- 1; j >= 0 ; j--) {
                if (chocolate[i] >= child[j]) {
                    res++;
                    child[j] = 1000;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
