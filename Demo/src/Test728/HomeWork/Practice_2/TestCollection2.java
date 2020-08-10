package Test728.HomeWork.Practice_2;

import java.util.ArrayList;

/**
 * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()
 */
public class TestCollection2
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,36,8};
        ArrayList<Integer> arrayList = ChangeSame(arr);
        System.out.println("arrayList:"+arrayList);



    }

    public static ArrayList<Integer> ChangeSame(int[] arr ){
        //创建集合存储
        ArrayList<Integer> arrayList = new ArrayList<>();
        //遍历数组，将数组值加入集合中
        for (int i:arr) {
             arrayList.add(i);
        }
        return arrayList;



    }
}
