package Test729.HashMapDemo.Practice_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap
{
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<>();
        map.put("华为","Honor");
        map.put("苹果","apple");
        map.put("长虹","LongRed");

        Set<Map.Entry<String,String>> setEntry = map.entrySet();
        for (Map.Entry<String,String> entry:setEntry) {
            String key = entry.getKey();
            String value =entry.getValue();
            System.out.println(key+"-----"+value);
        }
    }
}
