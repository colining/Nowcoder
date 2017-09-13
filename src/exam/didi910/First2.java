package exam.didi910;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/10.
 */
public class First2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());

        String str = sc.nextLine();
        String[] st = str.split(" ");

        int start = 0;
        int m = 0;

        for (int i = 0; i < st.length; i++) {
            if (Integer.parseInt(st[i]) == 0) {
                m++;
                start = i + 1;
                continue;
            }

            for (int j = start; j < i; j++) {
                int flag = 0;
                for (int k = j; k <= i; k++)
                    flag ^= Integer.parseInt(st[k]);
                if (flag == 0) {
                    m++;
                    start = i + 1;
                    continue;
                }
            }
        }
        System.out.println(m);
    }
}

