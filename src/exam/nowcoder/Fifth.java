package exam.nowcoder;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/24.
 */
public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextLong();
            func(n);
        }
    }

    private static void func(long n) {
        int end = (int) (Math.log10(n) / Math.log10(2));
        for (long i = 2; i<=end ; i++) {
            double p = Math.pow(n, 1d / i);
            if ((long) p == p && isPrime(p)) {
                System.out.println((long) p + " " + i);
                return;
            }
        }
        System.out.println("No");
    }

    private static boolean isPrime(double p) {
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}
