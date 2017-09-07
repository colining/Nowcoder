package exam.tuyayidong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by colin on 2017/9/7.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(lengthOfLongestSubstring(str));
        }
    }

    //想法很简单，一次遍历，通过hash保存某个数字的上一次出现位置，如果
    //出现重复，就更新这个数字的位置；
    //j指针一直向前，表示当前子串的结尾，i表示子串的开头，i可以跳跃移动；
    public static int lengthOfLongestSubstring(String s) {
        int result=0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i+1);
            map.put(s.charAt(j), j+1);
        }
        return result;
    }
}
