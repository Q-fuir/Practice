package Test728.HomeWork.Practice_4;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
 */
public class TestCollection4
{
    public  static  boolean listTest(ArrayList<String> al, String s){
        boolean flag;
        for (String string: al ) {
            if(string.contains(s)){
                return flag=true;
            }
        }

       return flag=false;
    }

    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("J");
        arrayList.add("K");
        arrayList.add("Q");
        arrayList.add("O");
        System.out.println(listTest(arrayList, "J"));
        System.out.println(listTest(arrayList, "P"));
        System.out.println(listTest(arrayList, "L"));

    }

}
