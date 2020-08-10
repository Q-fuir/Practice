package Test728.HomeWork.Practice_3;

import java.util.ArrayList;

/**
 * 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
 * （可以使用Object[]数组类型接收转换的数组）
 */
public class TestCollection3
{
    public  static  Object[] change(ArrayList<Integer> arrayList){
        Object[] objects = new Object[arrayList.size()];
        for (int i = 0; i <arrayList.size() ; i++) {
            objects[i]=arrayList.get(i);
        }
        return  objects;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList  = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(2);
        Object[] objects = change(arrayList);
        System.out.print("object数组：");
        for (int i = 0; i <objects.length ; i++) {
            System.out.print(objects[i]+" ");
        }


    }
}
