package com.company;

import java.util.Arrays;

/**
 * Created by asus on 2017/4/3.
 */
 class Base1 {
    String a = "aaaaa";
    public  Base1()
    {

    }

    public void test()
    {
        System.out.println(a);
    }

}
class Base2 extends Base1
{
    String a = "bbbbb";
    public Base2() {
    }
    public void  test()
    {
        super.test();
    }
    public  static  void  main(String [] arg)
    {
        System.out.println(Math.pow(64, 1.0 / 3));
        System.out.println(Math.pow(64, 1.0 / 3)==4.0);
        int [] a={1,5,3,6,2,4};
        for (int i = 0; i < a.length; i++) {
            if (a[i]==2)
                return;
            System.out.println(a[i]);
        }
        Arrays.asList(a);

    }
}
