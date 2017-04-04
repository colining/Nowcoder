package com.company;

import java.util.*;

/**
 * Created by asus on 2017/3/19.
 */
public class Test implements InterFaceTest{
    public  static void  main(String []arg)
    {
//        Test("a","b","c","d");
//        InterFaceTest interFaceTest= new Test();
//        interFaceTest.b();
//        int a = 5;
//        int b = 3;
//        String s = "l";
//        System.out.println(a+s+b);  //513
//        System.out.println(a+b+s);  //81  先做a+b，然后再转型
//        String str1="a";
//        String str2 = str1+"b";
//        String str3 = "ab";
//        System.out.println(str2 == str3); //输出false
//        StringBuffer s =  new StringBuffer("aba");
//        StringBuffer s1 = new StringBuffer("aba");
//        StringBuilder s2 = new StringBuilder("ccc");
//        StringBuilder s3 = new StringBuilder("ccc");
//        System.out.println(s.equals(s1));
//        System.out.println(s2.equals(s3));
//        ArrayList<Integer> arrayList = new ArrayList<>(5);
//        arrayList.ensureCapacity(100);
        Map<Integer, Integer> map = Collections.singletonMap(1, 1);
        System.out.println(map.size());

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
