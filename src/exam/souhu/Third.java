package exam.souhu;

import java.util.*;

/**
 * Created by colin on 2017/9/17.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            func(str);
        }
    }

    private static void func(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String s : path.split("/")) {
            if (s.equals("..") && !stack.isEmpty())
                stack.pop();
            else if (!skip.contains(s))
                stack.push(s);
        }
        String res = "";
        for (String s : stack)
            res = "/" + s + res;
        System.out.println(res.isEmpty() ? "/" : res);
    }
}
