package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * Created by asus on 2017/4/12.
 */
public class ArrayListTest {
    public  static  void  main(String []arg)
    {
        Integer a = 5;
        System.out.println(a.hashCode());
        a = 6;
        System.out.println(a.hashCode());
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("123");
        String str1 = new String("#%^");
        System.out.println(str1.charAt(2));
        ListIterator iterator1 = arrayList.listIterator();
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next().toString());
        }
        iterator1.add(3366);
        //iterator1.set(3366);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.toString());
            System.out.println(iterator.next().toString());
        }
    }
}
