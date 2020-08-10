package Test730.Lambda.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test
{
    public static void main(String[] args)
    {

//        ArrayList<Person> arrayList = new ArrayList<>();
//        Person p = new Person("SUN",222);
//        Person p1 = new Person("QQ",8888);
//        Person p2 = new Person("WWW",999414);
//
//        arrayList.add(p);
//        arrayList.add(p1);
//        arrayList.add(p2);
//
//        Collections.sort(arrayList);
//
//        System.out.println(arrayList);




        //数组

        Person[] p ={
           new Person("Ss",225),
           new Person("DD",35),
           new Person("ww",3000),
           new Person("KK",777),
        };

        Arrays.sort(p);

        System.out.println(Arrays.toString(p));






    }
}
