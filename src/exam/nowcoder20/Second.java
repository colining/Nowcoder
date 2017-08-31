package exam.nowcoder20;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/29.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            func(a, b, c);
        }
    }

    private static void func(long a, long b, long c) {
        System.out.println((b - a) / c + ((b % c == 0 || a % c == 0) ? 1 : 0));
    }
}
