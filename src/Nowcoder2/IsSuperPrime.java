package Nowcoder2;

/**
 * Created by asus on 2017/3/24.
 */

import java.util.Scanner;

/**
 * Created by asus on 2017/3/11.
 */
public class IsSuperPrime {
    public  static  void  main(String []arg)
    {
        Scanner scanner = new Scanner(System.in);
        long  number= scanner.nextLong();
        boolean IsSuperPrime = false;

        long datamax = (long)Math.pow(10,18);
        if ((number>=2)&&(number<=datamax))
        {
            int q = 2;
            double p;
            do {
                p = (int) (Math.pow(number,(1.0/q))+0.5);
                if (number == Math.pow(p,q))
                {
                    IsSuperPrime = isPrime(p);
                    if (IsSuperPrime)
                    {
                        System.out.println((int)p+" "+(int)q);
                        break;
                    }
                }
                q++;
            }while (p>=2);
            if (!IsSuperPrime)
            {
                System.out.println("No");
            }
            else
            {

            }
        }
    }
    public  static  boolean isPrime(double i)
    {
        boolean isPrime = true;
        for (int k = 2; k <=Math.sqrt(i);k++)
        {
            if (i%k==0)
            {
                isPrime = false;
                break;
            }
        }
        return  isPrime;
    }
}


