package Exercise722;

import java.util.ArrayList;

public class TestMyList
{
    public static void main(String[] args)
    {

        MyList myList = new MyList();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }
        System.out.println("添加元素后:");
        myList.show();

        Integer remove = myList.remove(1);
        System.out.println("获取元素:");
        System.out.println(remove);
        System.out.println("获取元素后:");
        myList.show();


    }
}
