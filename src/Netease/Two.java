package Netease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asus on 2017/3/25.
 */
public class Two {
    public  static  void  main(String [] arg)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            System.out.println(solution1(a));
        }
    }
    static  public  int solution(String a)
    {
        int test= 0 ,test1=0;
        char[] c=a.toCharArray();
        char[] c1 =a.toCharArray();
        for ( int i=0;i<c.length;i++)
            for (int j = 0 ;j<c.length-1;j++)
            {
                if (c[j]=='B'&&c[j+1]=='G')
                {
                    char x= c[j];
                    c[j]=c[j+1];
                    c[j+1]=x;
                    test++;
                }
            }
        System.out.println(Arrays.toString(c));
        for ( int i=0;i<c1.length;i++)
            for (int j = 0 ;j<c1.length-1;j++)
            {
                if (c1[j]=='G'&&c1[j+1]=='B')
                {
                    char x= c1[j];
                    c1[j]=c1[j+1];
                    c1[j+1]=x;
                    test1++;
                }
            }
        System.out.println(Arrays.toString(c1));
        if (test<test1)
        return test;
        else
            return test1;
    }
    static  public  int solution1(String a)
    {
        char[] c =a.toCharArray();
        int left=0,left1=0;
        int right=0,right1=0;
        for (int i =0;i<c.length;i++)
        {
            if (c[i]=='G')
                left++;
            else
                left1+=left;
        }
        for (int i =0;i<c.length;i++)
        {
            if (c[i]=='B')
                right++;
            else
                right1+=right;
        }
        return left1>right1?right1:left1;

    }
}
