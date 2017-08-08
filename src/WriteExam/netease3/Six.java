package WriteExam.netease3;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        System.out.println(func1(num));
    }

    private static long func1(long num) {
        for (long i = (long) Math.sqrt(num); i > 0 ; i--) {
            if (i * i + i <= num) {
                return i;
            }
        }
        return 0;
    }
}
