package WriteExam.netease;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(func1(n, m));
//        System.out.println(rev(10002));
    }

    private static long func1(long n, long m) {
        return rev(rev(n) + rev(m));
    }

    private static long rev(long n) {
        if (n < 10) {
            return n;
        }
        long result = 0;
        long temp = 0;
        while (n != 0) {
            temp = n % 10;
            result += temp;
            result *= 10;
            n /= 10;
        }
        return result/10;
    }
}
