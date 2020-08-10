package Test729.HomeWork.Practice_2;

import java.util.*;

/**
 * 、往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
 */
public class TestMap2
{
    public static void main(String[] args)
    {
        Map<String,String> map =new HashMap<>();
        map.put("Big","大");
        map.put("Small","小");
        map.put("Mid","中");


        System.out.print("增强for遍历:");
        //增强for
        Collection<String> collection =map.values();
        for (String value:collection){
            System.out.print(value+" ");
        }

        System.out.print("\n"+"迭代器遍历:");


        //迭代器遍历
        Iterator<String> iterator =collection.iterator();
        while (iterator.hasNext()){
            String  value = iterator.next();
            System.out.print(value+" ");
        }
    }
}
