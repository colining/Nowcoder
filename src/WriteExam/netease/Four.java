package WriteExam.netease;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        System.out.println(func1(num));
        System.out.println(func2(num));
    }

    private static long func2(int num) {
        long[] dp = new long[num + 1];
        dp[1] = 3;
        dp[2] = 9;
        for (int i = 3; i <= num ; i++) {
            dp[i] = 2 * dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }

    private static int func1(int num) {
        int amount = (int) Math.pow(3, num);
        System.out.println(amount);
        if (num <= 2) {
            return amount;
        }
        int lightNum = (6 * (num - 3 + 1) * (int) Math.pow(3, num - 3));
        if (num == 3) {
            return amount - lightNum;
        }
        return amount - lightNum/2;
    }
}
