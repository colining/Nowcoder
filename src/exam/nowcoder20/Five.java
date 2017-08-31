package exam.nowcoder20;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/30.
 */
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
//            fun(n);
            fun2(n);
        }
    }

    private static void fun2(int n) {
        if (n < 10) {
            System.out.println("NO");
            return;
        }
        char[] chars = String.valueOf(n).toCharArray();
        int sum = 1;
        int count0 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                count0++;
            }
            sum *= chars[i] - '0';
        }
        if (count0 >= 2) {
            System.out.println("YES");
            return;
        } else if (sum == 0 && count0 < 2) {
            System.out.println("NO");
            return;
        }
        int temp = 1;
        for (int i = 0; i < chars.length; i++) {
            temp *= chars[i] - '0';
            if (temp == sum / temp) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    private static void fun(int n) {
        if (n < 10) {
            System.out.println("NO");
            return;
        }
        char[] chars = String.valueOf(n).toCharArray();
        int i = 0, j = chars.length - 1;
        int left = chars[i]-'0', right = chars[j] - '0';
        while (i < j-1) {
            if ((left > right&&right!=0) ||left == 0) {
                j--;
                right *= chars[i] - '0';
            }
            if ((right > left&&left!=0)||right == 0) {
                i++;
                left *= chars[i] - '0';
            }
            if (left == right) {
                if (i == j-1) {
                    break;
                }else {
                    if (chars[i + 1] < chars[j - 1]) {
                        i++;
                        left *= chars[i] - '0';
                    }else {
                        j--;
                        right *= chars[j] - '0';
                    }
                }
            }
        }
        System.out.println((left == right)?"YES":"NO");

    }
}
