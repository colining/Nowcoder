package WriteExam.netease;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fun1(num));
    }

    private static long fun1(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & 1) != 0) {
                result += i;
                continue;
            }
            int temp = i;
            while ((temp & 1) == 0) {
                temp >>= 1;
            }
            result += temp;
        }
        return result;
    }
}
