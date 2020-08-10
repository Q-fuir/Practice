package Test728.HomeWork.Practice_1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *   Collection<String> list = new ArrayList<>();
 *             list.add("a");
 *             list.add("a");
 *             list.add("b");
 *             list.add("b");
 *             list.add("c");
 *             System.out.println("a:"+listTest(list, "a"));
 *             System.out.println("b:"+listTest(list, "b"));
 *             System.out.println("c:"+listTest(list, "c"));
 *             System.out.println("xxx:"+listTest(list, "xxx"));
 *             请定义方法listTest()统计集合中指定元素出现的次数，如"a": 2,"b": 2,"c" :1, "xxx":0。
 */
public class TestCollection
{
    public static void main(String[] args)
    {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a出现次数是："+listTest(list,"a"));
        System.out.println("b出现次数是："+listTest(list,"b"));
        System.out.println("c出现次数是："+listTest(list,"c"));
        System.out.println("xxx出现次数是："+listTest(list,"xxx"));

    }

    public static int listTest(Collection<String> collection,String str){
        //用于计数
        int count=0;
        for (String s: collection) {
            if(s.equals(str)){
                count++;
            }
        }

        return count;
    }
}
