package Nowcoder2;

import java.util.Scanner;

/**
 * Created by asus on 2017/3/23.
 */
public class Two {
    public  static  void  main(String [] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        String string[] = new String[a];
        while (a>0)
        {
            string[string.length-a]=scanner.next();
            a--;
        }
        System.out.println(two(string));

    }
    public  static  int two(String [] strings)
    {
        int b=1;
        int myarray[][] = new int[500][500];
        for ( int i = 0 ;i<strings.length;i++)
        {

            char a[]=strings[i].toCharArray();
            for (int j = 0 ; j<a.length;j++)
            {
                    myarray[i][a[j]]++;
            }
        }
        for (int i=0;i<strings.length;i++)
        {
            boolean flag = false;
            for (int j = i ; j <strings.length;j++)
            {

                for (int x=0;x<myarray[0].length;x++)
                {
                    if (myarray[i][x]!=myarray[j][x]&&flag==false)
                    {
                        b++;
                        flag=true;
                    }
                }


            }
        }
        return b;
    }
}
