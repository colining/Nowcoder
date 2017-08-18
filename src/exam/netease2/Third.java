package exam.netease2;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/12.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(func1(n, k));
        }
    }

    private static long func1(int n, int k) {
        long dp[][] = new long[(int) n+1][(int) k+1];
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
            for (int j = 1 ; j <=k ; j++) {
                if (i == 1) {
                    dp[1][j] = j;
                }
                if (j == 1) {
                    dp[i][j] = 1;
                } else {
                    long temp = 0;
                    for (int l = 2; l < j; l++) {
                        if (j % l != 0) {
                            for (int m = 1; m <= i - 1; m++) {
                                temp += (dp[m][j - 1] % 1000000007);
                            }
                        }
                    }
                    dp[i][j] = dp[i][j] + dp[i - 1][j - 1] + temp + 1;
                    dp[i][j] = dp[i][j] % 1000000007;
                }
            }
        }
        return dp[n][k];
    }
}
