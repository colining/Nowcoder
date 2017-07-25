package exam.nowcoder7_25;

import java.util.Scanner;

/**
 * Created by colin on 2017/7/25.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            System.out.println(fun1(a));
        }

    }

    public static int fun1(String a) {
        if (a == null || a.length() == 0) {
            return 0;
        }
        char[] chars = a.toCharArray();
        for (int i = chars.length - 2; i >= 0; i--) {
            if ((i & 1) != 1) {
                continue;
            }
            if (chars[i] == chars[i/2]) {
                if (check(chars, 0, i)) {
                    return i + 1;
                }
            }
        }
        return 0;
    }
    private static boolean check(char[] chars, int start, int end) {
        if (((end - start) & 1) != 1) {
            return false;
        }
        int mid = (start + end) / 2+1;
        int rightStart = mid;
        while (start < mid) {
            if (chars[start++] != chars[rightStart++]) {
                return false;
            }
        }
        return true;
    }
}
