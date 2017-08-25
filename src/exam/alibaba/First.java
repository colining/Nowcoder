package exam.alibaba;

/**
 * Created by colin on 2017/8/25.
 */

import java.util.Scanner;
public class First {
    private static final int CUSTOMS_LIMIT_MONEY_PER_BOX = 2000;
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     * @param items
     * @param boxTemplate**/
    private static int process(Model[] items, BoxTemplate boxTemplate)
    {
        int sum = 0;
        long T = 0;
        for (Model item : items) {
            sum += item.price;
            if (item.width > boxTemplate.width || item.height > boxTemplate.height || item.length > boxTemplate.length) {
                return -1;
            }
            T += item.height * item.width * item.length;
        }
        long boxT = boxTemplate.height * boxTemplate.length * boxTemplate.width;
        return (int) Math.max((int) Math.ceil(sum / (double) CUSTOMS_LIMIT_MONEY_PER_BOX), T / (double) boxT);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        BoxTemplate boxTemplate = new BoxTemplate();
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            Model[] items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            System.out.println (process(items,boxTemplate));

        }
    }
    public static class BoxTemplate{

        public  int price;
        public  int length;
        public  int width;
        public  int height;
    }

    private static class Model {
        public int price;
        public int length;
        public int width;
        public int height;
    }
}