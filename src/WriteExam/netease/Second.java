package WriteExam.netease;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int r = scanner.nextInt();
            System.out.println(func1(r));
        }
    }

    private static int func1(long r) {
        if (r <= 0) {
            return 0;
        }
        HashSet<Long> set = new HashSet<>();
        for (long i = 1; i < Math.sqrt(r); i++) {
            long temp = r - i * i;
            long a = (long) Math.sqrt(temp);
            if (a * a == temp) {
                set.add(i);
                set.add(a);
            }
        }
        if (Math.ceil(Math.sqrt(r)) != Math.floor(Math.sqrt(r))) {
            return set.size() * 4;
        }
        return set.size()*4+4;
    }
}
