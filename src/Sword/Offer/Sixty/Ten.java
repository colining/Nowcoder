package Sword.Offer.Sixty;

import Myjar.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by asus on 2017/5/4.
 */
public class Ten {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if ( pRoot ==null)
            return  arrayLists;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<TreeNode> linkedlist = new LinkedList();
        linkedlist.add(null);
        linkedlist.add(pRoot);
        boolean leftToright = true;
        while (linkedlist.size()!=1)
        {
            TreeNode node = linkedlist.removeFirst();
            if (node == null) {
                Iterator<TreeNode> iterator = null;
                if (leftToright)
                {
                    iterator = linkedlist.iterator();
                }
                else
                    iterator = linkedlist.descendingIterator();
                leftToright = !leftToright;
                while (iterator.hasNext())
                {
                    TreeNode temp = iterator.next();
                    arrayList.add(temp.val);
                }
                arrayLists.add(new ArrayList<Integer>(arrayList));
                arrayList.clear();
                linkedlist.addLast(null);
                continue;
            }
            if (node.left != null)
            {
                linkedlist.addLast(node.left);
            }
            if (node.right != null)
            {
                linkedlist.addLast(node.right);
            }
        }
        return arrayLists;
    }
}
