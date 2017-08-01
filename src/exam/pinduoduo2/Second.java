package exam.pinduoduo2;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/1.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String str[] = a.split(" ");
        System.out.println(fun1(str[0], str[1]));
    }

    private static String fun1(String a, String b) {
        if (a == null || a.length() == 0 || b == null || b.length() == 0) {
            return "";
        }
        char[] chara = a.toCharArray();
        char[] charb = b.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chara.length-1; i >=0; i--) {
            StringBuilder stringBuilder = new StringBuilder();
            add0(stringBuilder, chara.length - 1 - i);
            int temp1 = 0;
            for (int j = charb.length - 1; j >= 0; j--) {
                int temp2 = (chara[i] -48)* (charb[j]-48) + temp1;
                stringBuilder.append(temp2 % 10);
                temp1 = temp2 / 10;
            }
            stringBuilder.append(temp1);
            result = add(result, stringBuilder);
        }
        result = change(result);
        return result.toString();
    }

    private static StringBuilder change(StringBuilder result) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = result.toString().length() - 1;
        while (result.charAt(i) == '0') {
            i--;
        }
        for (; i >=0; i--) {
            stringBuilder.append(result.charAt(i));
        }
        return stringBuilder;
    }

    private static void add0(StringBuilder stringBuilder, int i) {
        for (int j = 0; j < i; j++) {
            stringBuilder.append('0');
        }
    }

    private static StringBuilder add(StringBuilder result, StringBuilder stringBuilder) {
        if (result.length() == 0) {
            return stringBuilder;
        }
        else {
            char[] a = result.toString().toCharArray();
            char[] b = stringBuilder.toString().toCharArray();
            StringBuilder stringBuilder1 = new StringBuilder();
            int i = 0;
            int temp = 0;
            while (i < a.length && i < b.length) {
                int sum = (a[i] - 48) + (b[i] - 48)+temp;
                stringBuilder1.append(sum % 10);
                temp = sum / 10;
                i++;
            }
            if (a.length > b.length) {
                for (int j = i-1; j < a.length; j++) {
                    int sum = temp + a[j];
                    stringBuilder1.append(sum % 10);
                    temp = sum / 10;
                }
            }
            if (a.length < b.length) {
                for (int j = i; j < b.length; j++) {
                    int sum = temp + (b[j]-48);
                    stringBuilder1.append(sum % 10);
                    temp = sum / 10;
                }
            }
            stringBuilder1.append(temp);
            return stringBuilder1;
        }

    }
}
