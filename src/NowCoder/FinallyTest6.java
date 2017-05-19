package NowCoder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by colin on 2017/5/19.
 */
public class FinallyTest6
{
    public static void main(String[] args) {
        System.out.println(getMap().get("KEY").toString());
    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("KEY", "INIT");

        try {
            map.put("KEY", "TRY");
            return map;
        }
        catch (Exception e) {
            map.put("KEY", "CATCH");
        }
        finally {
            map.put("KEY", "FINALLY");
            map = null;
        }

        return map;
    }
}