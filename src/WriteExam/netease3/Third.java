package WriteExam.netease3;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while (true) {
            String a = scanner.nextLine();
            if (a.length() == 0) {
                System.out.println(set.size());
                set = new HashSet<>();
                continue;
            }
            String[] aa = a.split(" ");
            for (int i = 0; i < aa.length; i++) {
                    set.add(aa[i]);
            }
        }

    }
}


