package Nowcoder2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by asus on 2017/3/24.
 */
public class Two1 {
    public  static  void  main(String [] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<String>();
        while (n!=0)
        {
            char[] array = scanner.next().toCharArray();
            Arrays.sort(array);
            set.add(String.valueOf(array));
            n--;
        }
        System.out.println(set.size());
    }
}
