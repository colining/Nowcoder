package WriteExam.netease3;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] energy = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                energy[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            int d = scanner.nextInt();
            func1(n, energy, k, d);
        }
    }

    private static void func1(int n, int[] energy, int K, int d) {
        //以选择第k个数时，以n结尾时的最大值
        long[][] fMax = new long[K + 1][n + 1];

        long[][] fMin = new long[K + 1][n + 1];


        //以某个位置结尾，以此计算当他作为第k个数选择时的最大值
        long res = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            fMax[1][i] = energy[i];
            fMin[1][i] = energy[i];
            for (int k = 2; k <= K; k++) {
                for (int j = i - 1; j > 0 && i - j <= d; j--) {
                    fMax[k][i] = Math.max(fMax[k][i], Math.max(fMax[k - 1][j] * energy[i], fMin[k - 1][j] * energy[i]));
                    fMin[k][i] = Math.min(fMin[k][i], Math.min(fMax[k - 1][j] * energy[i], fMin[k - 1][j] * energy[i]));
                }

            }
            res = Math.max(res, fMax[K][i]);
        }
        System.out.println(res);
    }


}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        while (cin.hasNextInt()) {
//            int n = cin.nextInt();
//            int[] arr = new int[n + 1];
//            for (int i = 1; i <= n; i++) {
//                arr[i] = cin.nextInt();
//            }
//            int K = cin.nextInt();
//            int d = cin.nextInt();
//            long[][] fmax = new long[K + 1][n + 1]; // 记录最大乘积
//            long[][] fmin = new long[K + 1][n + 1]; // 记录最小乘积
//// fmax[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最大乘积；
//// fmin[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最小乘积；
////初始化第一行
//            long res = Integer.MIN_VALUE; // 记得用Long类型，考虑数值范围
//            for (int i = 1; i <= n; i++) {
//                fmax[1][i] = arr[i];
//                fmin[1][i] = arr[i];
//                for (int k = 2; k <= K; k++) {
//                    for (int j = i - 1; j > 0 && i - j <= d; j--) {
//                        fmax[k][i] = Math.max(fmax[k][i], Math.max(fmax[k - 1][j] * arr[i], fmin[k - 1][j] * arr[i]));
//                        fmin[k][i] = Math.min(fmin[k][i], Math.min(fmax[k - 1][j] * arr[i], fmin[k - 1][j] * arr[i]));
//                    }
//                }
//                res = Math.max(res, fmax[K][i]);
//            }
//            System.out.println(res);
//        }
//    }
//}