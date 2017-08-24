package exam.nowcoder;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/24.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            fun(a, b);
        }
    }

    private static void fun(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println(0);
            return;
        }
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a1[i] == 'T' && b1[i] != 'A'||a1[i] == 'A'&&b1[i]!='T') {
                sum++;
            }
            if (a1[i] == 'G' && b1[i] != 'C' || a1[i] == 'C' && b1[i] != 'G') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
