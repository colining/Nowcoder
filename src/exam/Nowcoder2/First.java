package exam.Nowcoder2;

import java.util.Scanner;

/**
 * Created by asus on 2017/3/23.
 */
public class First {
    public  static  void  main(String []arg)
    {
        boolean a;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            a=solution(in.nextInt());
            if (a)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    static public boolean  solution(int a)
    {
        boolean result=false;
        if (a<10)
            return  false;
        int digit = (int) Math.log10(a);             //位数
        Integer a1 = a;                              //对象化a
        char []c = a1.toString().toCharArray();      //char[]数组化

        /*
        从左边取j位数，右边取剩下的，
        然后作比较
         */
        for (int j=0;j<digit;j++) {
            int x = 1;
            for (int i = 0; i <=j; i++) {       //计算左边部分的乘积，位数越高，char[]位置就越低
                x *= (c[i] - 48);
            }

            int y = 1;
            for (int i = digit; i > j; i--) {   //计算右边部分的乘积
                y *= (c[i] - 48);
            }
            if (x == y) {                       //相等的话，说明有这么一种情况左右相等了；
                result = true;
                break;
            }
        }
        return result;
    }
}
