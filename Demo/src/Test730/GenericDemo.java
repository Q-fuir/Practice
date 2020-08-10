package Test730;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo
{

    public static void main(String[] args)
    {
        //泛型可以限制类型，若泛型没写限制，则默认Object类
        Collection<String> list =new ArrayList<>();
        list.add("abc");
        list.add("bfb");
        //已将明确类型，再使用迭代器的时候，迭代器也同样知道遍历元素的具体类型
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s= iterator.next();
            //使用iterator()在这里可以直接获取String类型
            System.out.println(s);
        }

    }
}
