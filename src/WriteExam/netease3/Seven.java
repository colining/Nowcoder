package WriteExam.netease3;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String res = func1(s, t) ? "Yes" : "No";
        System.out.println(res);
    }

    private static boolean func1(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (charS[i] == charT[j]) {
                j++;
            }
            if (j == t.length()) {
                return true;
            }
        }
        return false;
    }
}
