package exam.JD98;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/8.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
//            func(str);
            func1(str);
        }
    }

    private static void func1(String str) {
        if (str == null || str.length() == 0) {
            System.out.println(1);
            return;
        }
        int[] array = new int[20];
        char[] chars = str.toCharArray();
        int i = chars.length-1;
        long sum = 1;
        int k = 0;
        while (i>=0) {
            long j = 0;
            while (chars[i] == ')') {
                i--;
                j++;
                sum *= j;
            }
            i--;
        }
        System.out.println(sum);
    }

    private static void func(String str) {
        if (str == null || str.length() == 0) {
            System.out.println(1);
            return;
        }
        char[] chars = str.toCharArray();
        int i = 0;
        long sum = 1;
        while (i < chars.length) {
            long j = 0;
            while (chars[i] == '(') {
                i++;
                j++;
                sum *= j;
            }
            i++;
        }
        System.out.println(sum);
    }
}
