package Exercise722;

import java.util.ArrayList;

public class MyList
{
    ArrayList<Integer> list = new ArrayList<>();
    //add方法
    public void  add(Integer i){
        list.add(i);
    }

    //remove方法
    public Integer remove(Integer index){
        Integer integer = list.remove(list.size()-1);
        return integer;
    }

    //show方法
    public void show(){
            System.out.println(list);
    }
}
