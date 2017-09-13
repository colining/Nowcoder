package exam.nowcoder1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/23.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] word = new String[n];
        String a = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            word[i] = scanner.nextLine();
        }
        func(word);
    }

    private static void func(String[] word) {
        if (word.length == 1) {
            System.out.println(1);
        }

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < word.length; i++) {
            boolean flag = true;
            if (hashSet.isEmpty()) {
                hashSet.add(word[i]);
            }else {
                for (String s : hashSet) {
                    if (check(s, word[i])) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                hashSet.add(word[i]);
            }
        }
        System.out.println(hashSet.size());
    }

    private static boolean check(String s, String s1) {
        if (s.length() != s1.length()) {
            return false;
        }
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s1.charAt(i)) {
                if (s.equals(change(s1, i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String change(String s1, int i) {
        String a = s1.substring(i, s1.length()) + s1.substring(0, i);
        return s1.substring(i, s1.length()) + s1.substring(0, i);

    }

}
