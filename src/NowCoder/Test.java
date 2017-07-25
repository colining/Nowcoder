package NowCoder;

import java.util.Arrays;

/**
 * Created by colin on 2017/5/20.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println('5'-0);
        Test2 test2 = new Test2();
        System.out.println(test2.x);
        //a();
    }
    public static void a(){
        Integer i = 1;
        b(i);
        System.out.println(i);
    }
    public static void b(Integer i){
        ++i;

        return;
    }

    public void c(String s) {
        switch (s) {

        }
    }
}
class  Test2{
    byte x;
}
