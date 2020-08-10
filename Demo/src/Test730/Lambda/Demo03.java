package Test730.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03
{
    public static void main(String[] args)
    {
        Person[] people ={
                new Person("sunny",21),
                new Person("tina",2152),
                new Person("sy",2122),
                new Person("ny",991),
        };

       Comparator<Person> comparator = new Comparator<>(){

           @Override
           public int compare(Person o1, Person o2)
           {
               return o1.getAge()-o2.getAge();
           }

        };
        Arrays.sort(people,comparator);
        System.out.println(Arrays.toString(people));
    }
}
