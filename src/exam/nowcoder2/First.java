package exam.nowcoder2;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/29.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        func(a, b);
    }

    private static void func(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < charsA.length; i++) {
            int tempI = i;
            for (int j = 0; j < charsB.length; j++) {
                int tempJ = j;
                int cur = 0;
                while (tempI+cur<charsA.length && tempJ+cur<charsB.length&&charsA[tempI+cur] == charsB[tempJ+cur]) {
                    cur++;
                }
                max = Math.max(cur, max);
                j = tempJ==j?j :tempJ-1;
            }
        }
        System.out.println(max);
    }
}
