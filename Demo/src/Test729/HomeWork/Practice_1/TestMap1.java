package Test729.HomeWork.Practice_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
 */
public class TestMap1
{
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<>();
        map.put("亚瑟","安琪拉");
        map.put("后羿","嫦娥");
        map.put("孙策","大乔");
        map.put("周瑜","小乔");

        map.remove("亚瑟");

        Set<String> set =map.keySet();
        for (String key:set){
            String value = map.get(key);
            System.out.println(key+"-------"+value);
        }
    }
}
