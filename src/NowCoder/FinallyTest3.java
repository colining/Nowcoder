package NowCoder;

/**
 * Created by colin on 2017/5/19.
 */
public class FinallyTest3 {

    public static void main(String[] args) {

        System.out.println(test3());
    }

    public static int test3() {
        int b = 20;

        try {
            System.out.println("try block");

            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            return b+=20;
        }

        //return 2000;
    }

}