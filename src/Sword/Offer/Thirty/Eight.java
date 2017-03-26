package Sword.Offer.Thirty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by asus on 2017/3/26.
 */
public class Eight {
    public  static  void  main(String [] arg)
    {
            String a= "ab";
            Permutation(a);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

  static   public ArrayList<String> Permutation(String str) {
        if (str.length()==0)
            return  null;
        Permutation(str.toCharArray(),0);
      Collections.sort(arrayList);
        return arrayList;
    }
   static ArrayList <String>arrayList = new ArrayList<>();
    static  public  void  Permutation(char[] str,int i)
    {
        if (i==str.length-1) {
            arrayList.add(String.valueOf(str));
            //return;
        }
        else
            for (int j = i ; j<str.length;j++)
            {
                if (i==j||str[j]!=str[i]) {
                    swap(str, i, j);
                    Permutation(str, i + 1);
                    swap(str, i, j);
                }
            }
    }
   static public  void  swap(char [] str,int i ,int j)
    {
        char temp = str[i];
        str[i]=str[j];
        str[j]=temp;
    }
}
