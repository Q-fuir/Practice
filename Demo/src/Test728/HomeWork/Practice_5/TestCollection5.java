package Test728.HomeWork.Practice_5;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
 */
public class TestCollection5
{
    public  static  boolean listTest(ArrayList<String> al){
        if (al.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("qqq");
        System.out.println(listTest(arrayList));
        System.out.println("清除集合数据后");
        arrayList.clear();
        System.out.println(listTest(arrayList));

    }
}
