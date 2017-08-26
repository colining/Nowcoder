package exam.sanliling;

import com.sun.deploy.resources.Deployment_pt_BR;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/26.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
//            func(n, m, a, b, c, d, x, y, z);
            func1(n, m, a, b, c, d, x, y, z);
        }
    }

    private static void func1(int n, int m, int a, int b, int c, int d, int x, int y, int z) {
        int[][] dp = new int[n+1][m+1];
//        dp[0][c] = y;
//        dp[d][0] = z;
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                int max1 = i >= d ? dp[i - d][j] + z : 0;
                int max2 = j >= c ? dp[i][j - c] + y : 0;
                int max3 = (j >= b && i >= a) ? dp[i - a][j - b] + x : 0;
                int max = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j]= Math.max(max3, Math.max(max1, max2));
                dp[i][j] = Math.max(dp[i][j], max);
            }
        }
        System.out.println(dp[n][m]);
    }

    private static void func(int n, int m, int a, int b, int c, int d, int x, int y, int z) {
        int max = Integer.MIN_VALUE;
        int k = Math.min(n / a, m / b);
        int max1 =k*x +(n - a*k) / d * z + (m -b*k) / c * y;
        int max2 = (n / d) * z;
        int max3 = (m / c) * y;
        System.out.println(Math.max(max3,Math.max(max1, max2)));
    }
}
