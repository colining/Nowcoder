package Nowcoder2;

import java.util.Scanner;

/**
 * Created by asus on 2017/3/23.
 */
public class First {
    public  static  void  main(String []arg)
    {
//        Integer a=1000;
//        String b=a.toString();
//        char c[] = b.toCharArray();
//        System.out.println(c);
//        int a = 2241;
//        System.out.println(solution(a));
        boolean a;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
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
        int position = (int) Math.log10(a);
//        if ((position&1)==0)
//            return result;

        Integer a1 = a;
        char []c = a1.toString().toCharArray();


        for (int j=0;j<position;j++) {
            int x = 1;
            for (int i = 0; i <=j; i++) {
                x *= (c[i] - 48);
            }

            int y = 1;
            for (int i = position; i > j; i--) {
                y *= (c[i] - 48);
            }
            if (x == y) {
                result = true;
                break;
            }
        }
        return result;
    }
}
