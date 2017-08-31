package exam.nowcoder2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/30.
 */
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = scanner.next();
            }
            func(str);
        }
    }

    private static void func(String[] str) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            set.add(String.valueOf(chars));
        }
        System.out.println(set.size());
    }
}
