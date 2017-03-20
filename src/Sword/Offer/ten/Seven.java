package Sword.Offer.ten;

/**
 * Created by asus on 2017/3/19.
 */
import java.util.Stack;
public class Seven {
    public  static  void  main(String [] arg)
    {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.stack1);
        solution.pop();
        solution.pop();
        System.out.println(solution.stack2);
    }


    public static class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public  void push(int node) {
//            while (stack2.size()!=0)                          //上次pop时，栈2可能还有残留元素，首先想到了放回栈1
//            {
//                stack1.push(stack2.pop());
//            }
            stack1.push(node);

        }

        public int pop() {
                if (stack2.isEmpty()) {                             //如果栈2是空的，就直接pop栈2，否则从栈一获取元素
                    while (stack1.size() != 0) {
                        stack2.push(stack1.pop());
                    }
                    stack1.empty();                                //放到栈2后，栈2就是正确排列的队列了，栈一就可以清空了
                }
                return  stack2.pop();


        }
    }
}
