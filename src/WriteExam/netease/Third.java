package WriteExam.netease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
//        System.out.println(func2(start, end));
        System.out.println(func3(start, end));
    }

    private static int func3(int start, int end) {
        int[] dp = new int[end + 1];
        Arrays.fill(dp, end);
        dp[start] = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    if (i + j <= end) {
                        dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                    }
                    if (i + i / j <= end) {
                        dp[i + i / j] = Math.min(dp[i + i / j], dp[i] + 1);
                    }
                }
            }
        }
        return dp[end] == end? -1 : dp[end];
    }


    private static int func2(int start, int end) {
        int[] dp = new int[end + 1];
        for (int i = start; i <= end; i++) {
            for (int j = i / 2; j < i; j++) {
                if (i - j > 1 && i - j < j && i % (i - j) == 0) {
                    if (dp[i] == 0) {
                        dp[i] = dp[j] + 1;
                    } else {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[end] == 0 ? -1 : dp[end];
    }


}
