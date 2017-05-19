package NowCoder;

/**
 * Created by colin on 2017/5/19.
 */
public class Test {
    static Test test = new Test();

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
        Test.testa();
    }
}
