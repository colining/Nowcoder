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
        while (scanner.hasNext()) {
            set.add(scanner.next());
        }
        System.out.println(set.size());
        String a = "aaa";


    }
}


