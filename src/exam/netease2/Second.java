package exam.netease2;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/12.
 */

/*
    Scanner的while循环
    不要着急写，先弄懂过程，反正面试机会也不大
    long long long ！
 */

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long x = scanner.nextLong();
            long f = scanner.nextLong();
            long d = scanner.nextLong();
            long p = scanner.nextLong();
            System.out.println(func1(x, f, d, p));
        }
    }

    private static long func1(long x, long f, long d, long p) {
        long day = d / x;
        if (day <= f) {
            return day;
        }else {
            d -= f * x;
            day = f + d / (x + p);
            return day;
        }

    }
}
