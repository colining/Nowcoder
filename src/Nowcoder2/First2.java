package Nowcoder2;

/**
 * Created by asus on 2017/3/23.
 */


import java.util.Scanner;

public class First2 {
    public  static  void  main(String []arg)
    {
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
        int position = (int) Math.log10(a);
        if ((position&1)==0)
            return result;
        position+=1;
        Integer a1 = a;
        char []c = a1.toString().toCharArray();
        int x=1;
        for (int i = 0 ; i <position/2;i++)
        {
            x*=(c[i]-48);
        }

        int y=1;
        for (int i=position-1;i>=position/2;i--)
        {
            y*=(c[i]-48);
        }
        if (x==y)
            result=true;
        return result;
    }
}
