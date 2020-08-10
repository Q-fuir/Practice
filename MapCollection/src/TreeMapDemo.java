import jdk.nashorn.internal.ir.CallNode;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {
        //创建集合对象
        TreeMap<String,String> tm=new TreeMap<String, String>();
        tm.put("hello","你好");
        //遍历集合
        Set<String> set= tm.keySet();
        for (String key:set) {
            String value =tm.get(key);
            System.out.println(key+"-------"+ value);
        }
    }
}
