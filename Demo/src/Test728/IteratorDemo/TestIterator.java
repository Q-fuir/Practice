package Test728.IteratorDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestIterator
{
    public static void main(String[] args)
    {
        Collection<String> collection =  new ArrayList<>();
        collection.add("小鲁班");
        collection.add("后羿");
        collection.add("艾琳");
        collection.add("王昭君");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println();

        for(String s : collection){
            System.out.println(s);
        }

        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(90);

        System.out.println(Collections.binarySearch(arrayList,60));
        System.out.println(Collections.binarySearch(arrayList,600));
        System.out.println(Collections.binarySearch(arrayList,6000));
        System.out.println(Collections.binarySearch(arrayList,60000));



    }
}
