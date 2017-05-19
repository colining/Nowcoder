package com.company;

/**
 * Created by asus on 2017/5/5.
 */
public class QuickButtonTest {

    public static final int INT = 555;
    private static int aaaa;
    private final String a;
    private final String b;


    public QuickButtonTest(String a, String b) {

        this.a = a;


        if (1 == 1) {

        }
        this.b = b;
    }

    public static void aVoid(String string) {
        String a = "a";
        aaaa = 5555;
        int test = aaaa;
        int test2 = INT;
        test(string, a);
    }

    private static void test(String string, String a) {
        System.out.println(string + a);
    }

    public static void main(String[] args) {
        aVoid("   ");
        System.out.println(444);
    }
}
