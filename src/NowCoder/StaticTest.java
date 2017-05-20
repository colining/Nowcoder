package NowCoder;

/**
 * Created by colin on 2017/5/19.
 */
public class StaticTest {
    static StaticTest staticTest = new StaticTest();

    static {
        testa();
        System.out.println("静态代码块");
    }
    static void testa(){
        System.out.println("testa");
    }
    {
        System.out.println("非静态");
    }

    public static void main(String[] args) {
        StaticTest.testa();
    }
}
