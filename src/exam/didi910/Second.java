package exam.didi910;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/10.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int index = scanner.nextInt();
            System.out.println(GetUgly(index));
        }
    }
    static public int GetUgly(int index) {
        if (index <= 0)
            return 0;
        int ugly[] = new int[index];
        ugly[0] = 1;
        int temp2 = 0, temp3 = 0, temp5 = 0;
        for (int i = 1; i < index; i++) {
            ugly[i] = Math.min(5 * ugly[temp5], Math.min(2 * ugly[temp2], 3 * ugly[temp3]));
            if (ugly[i] == 2 * ugly[temp2])
                temp2++;
            if (ugly[i] == 3 * ugly[temp3])
                temp3++;
            if (ugly[i] == 5 * ugly[temp5])
                temp5++;
        }
        return ugly[index - 1];
    }
}
