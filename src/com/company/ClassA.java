package com.company;

/**
 * Created by asus on 2017/3/19.
 */
public class ClassA {
    int test=0;
    Test test1 =new Test("a");
    public  ClassA(int v)
    {
        System.out.println("father");
        System.out.println(test1.toString());
        init(v);
    }
    public  void  init(int v)
    {

        v=6;
    }
    public  void  father()
    {
        System.out.println(test1.toString());
    }
}
