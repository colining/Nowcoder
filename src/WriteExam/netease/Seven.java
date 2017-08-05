package WriteExam.netease;

import com.sun.deploy.resources.Deployment_pt_BR;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        System.out.println(func1(num));
        System.out.println(fun2(num));
    }

    private static int fun2(int num) {
        if (num == 6 || num == 8) {
            return 1;
        }
        if (num < 8) {
            return -1;
        }
        int[] dp = new int[num + 1];
        Arrays.fill(dp, num);
        dp[6] = 1;
        dp[8] = 1;
        for (int i = 6; i <=num ; i++) {
            if (dp[i] == num) {
                continue;
            }
            if (i + 6 <= num) {
                dp[i + 6] = Math.min(dp[i + 6], dp[i] + 1);
            }
            if (i + 8 <= num) {
                dp[i + 8] = Math.min(dp[i + 8], dp[i] + 1);
            }
        }
        return dp[num] == num ? -1 :dp[num];
    }

    private static int func1(int num) {
        int result = Integer.MAX_VALUE;
        int i = 0;
        //以6+8为一组
        while (i * 14 <= num) {
            if (i * 14 == num) {
                return i;
            }
            if ((num - (i * 14)) % 6 == 0) {
                result = Math.min(result, i*2 + (num - (i * 14)) / 6);
            }
            if ((num - (i * 14)) % 8 == 0) {
                result = Math.min(result, i*2 + (num - (i * 14)) / 8);
            }
            i++;
        }
        return result == Integer.MAX_VALUE? -1 :result;
    }
}
