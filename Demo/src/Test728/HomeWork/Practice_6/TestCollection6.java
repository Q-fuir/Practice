package Test728.HomeWork.Practice_6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class TestCollection6
{
    public static int listTest(ArrayList<Integer> al, Integer s)
    {
        for (int i = 0; i < al.size(); i++) {
            if (s.equals(al.get(i))) {
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(60);
        arrayList.add(50);
        Collections.sort(arrayList);
        System.out.println(listTest(arrayList, 50));
        System.out.println(listTest(arrayList, 70));
        System.out.println(listTest(arrayList, 700));

    }
}
