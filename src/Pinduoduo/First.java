package Pinduoduo;

import java.util.Scanner;

/**
 * Created by asus on 2017/3/19.
 */
public class First {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext())
        {
            int offset =scanner.nextInt();
            int  n = scanner.nextInt();
            int l1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            solution(offset,n,l1,l2);
        }

    }
    static void  solution(int offset,int n , int l1,int l2)
    {
        int l1start,l2start;
        int l1end,l2end;

        if (offset>=l1)
        {
            l1start=l1;
            l1end = l1;
            if (offset>=l1+l2)
            {
                l2start = l2;
                l2end = l2;
                System.out.println(l1start+" "+l1end+" " +l2start+" "+l2end);
                return;
            }
           l2start = offset-l1;
            l2end= l2start+n;
            System.out.println(l1start+" "+l1end+" " +l2start+" "+l2end);
        }
        else
        {
            l1start=offset;
            if (n-l1+offset<=0)
            {
                l1end=l1start+n;
                l2start=l2end=0;
            }
            else
            {
                l1end=l1;
                int x= n-l1+offset;
                if (x>=l2)
                {
                    l2start=0;
                    l2end = l2;
                }
                else
                {
                    l2start=0;
                    l2end=l2start+x;
                    if (l2end>l2)
                        l2end=l2;
                }
            }
            System.out.println(l1start+" "+l1end+" " +l2start+" "+l2end);
        }

    }
}
