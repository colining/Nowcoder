package com.company;

import java.util.ArrayList;

/**
 * Created by asus on 2017/3/19.
 */
enum Account
{
    Saving,fixed,current,LA;

    Account() {
        System.out.println("lalla");
    }
}
public class Test {

        public static void  main(String []arg)
        {
            //System.out.println(Account.fixed);
//            System.out.println(Math.round(11.49));
//            System.out.println(Math.ceil(-0.5));
//            System.out.println(Math.floor(-0.5));
//            int i = 1;
//            int j = 1;
//            boolean a=true?false:++i==2?false:true;
//            System.out.println("a:"+a+", i:"+i);
//            boolean b=false?true:++j==2?false:true;
//            System.out.println("b:"+b+", j:"+j);
//            boolean c = false?false:true;
//            System.out.println(c);
//            Object o = new Object();
            int [] a = {2,5,63,3,5};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < a.length; i++) {
                arrayList.add(a[i]);
                System.out.println(arrayList.get(0));
            }
        }

}
