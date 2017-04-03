package com.company;

/**
 * Created by asus on 2017/3/19.
 */
public class Test implements InterFaceTest{
    public  static void  main(String []arg)
    {
        Test("a","b","c","d");
        InterFaceTest interFaceTest= new Test();
        interFaceTest.b();
    }
  static   public  void  Test(String... vlaue)
    {
        for (int i = 0; i < vlaue.length; i++) {
            System.out.println(vlaue[i]);
        }
    }

    @Override
    public void a() {

    }

}
