package exam.JD;
import java.util.Scanner;

/**
 * Created by asus on 2017/4/7.
 */
public class Two {
    public  static  void  main(String [] arg)
    {
        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(fun3(a, b));
    }
    static public int fun1 (int numberofstone , int b )
    {

        int sum = 1;
        int count=0;
        boolean flag = false;
        if (b==0)
        {
            if (numberofstone%3!=0)
            {
                return (numberofstone/3)+1;
            }
            return numberofstone/3;
        }
        if (b==1) {
            b += 1;
            flag = true;
        }
        while (sum<=numberofstone)
        {

            sum+=b;
            if (sum>numberofstone)
                break;
            count++;
            sum+=1;
        }
        if (flag)
            count=count*2+1;
        return count;
    }
    static public int fun2 (int numberofstone , int b )
    {
        if (b==0||b==1)
        {
            if (numberofstone%3!=0)
            {
                return (numberofstone/3)+1;
            }
            return numberofstone/3;
        }
        return  numberofstone/(b+1);
    }
    static public int fun3 (int numberofstone ,int b)
    {
        int score;
        score = numberofstone/(2*b+1)*2;
        if (numberofstone%(2*b+1)>=b)
            score++;
        return score;
    }
}
