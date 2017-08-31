package exam.nowcoder1;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/24.
 */
public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextInt();
            func(n);
        }
    }

    private static void func(long n) {
        long[] array = new long[10];
        for (byte i = 0; i < 10; i++) {
            array[i] = getFactorCount(n, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]);
            if (i != 9) {
                System.out.print(" ");
            }
        }
    }

    public static long getFactorCount(long num, byte factor) {
        long count = 0;
        long current = 0, next = 0, before = 0;
        long i = 1;

        while ((num / i) != 0) {
            current = (num / i) % 10;
            next = num / (i * 10);
            before = num - (num / i) * i;

            if (current < factor) {
                count += next * i;
            } else if (current == factor) {
                count += factor == 0?((next-1) * i + before + 1):(next * i + before + 1);
            } else if (current > factor) {
                count += factor == 0?(next) * i: (next + 1) * i;
            }
            i *= 10;
        }
        return count;
    }
}
