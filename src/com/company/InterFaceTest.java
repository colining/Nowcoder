package com.company;

/**
 * Created by asus on 2017/4/3.
 */

public interface InterFaceTest {
        void  a();
        default void  b()
        {
            System.out.println("lll");
        }
        static void  c()
        {

        }

        int c=0;

}
