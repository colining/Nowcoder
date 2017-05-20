package exam.JD;

import java.util.Scanner;

/**
 * Created by asus on 2017/4/7.
 */
public class First {
    public  static  void  main (String []arg)
    {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        char [] ch1= new char[a];
        char [] ch2 = new char[a];
        ch1 = scanner.next().toCharArray();
        ch2 = scanner.next().toCharArray();
        System.out.println(fun1(ch1, ch2));

    }
    public static int fun1(char [] a , char [] b)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=b[i])
                a[i] = '1';
            else
                a[i] = '0';
        }
        int c = 0;
        for (int i = 0 ; i < a.length; i++) {
            if (a[i]=='1')
                c+= Math.pow(2,a.length-1-i);
        }
        return c;
    }
}
