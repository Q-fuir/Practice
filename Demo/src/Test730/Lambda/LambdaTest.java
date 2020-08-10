package Test730.Lambda;

import java.util.Arrays;

public class LambdaTest
{
    public static void main(String[] args)
    {
        Person[] people ={
                new Person("sunny",21),
                new Person("tina",2152),
                new Person("sy",2122),
                new Person("ny",991),
        };

        Arrays.sort(people,(Person a,Person b)->{
            return  a.getAge()-b.getAge();
        });

        for (Person person: people){
            System.out.println(person);
    }
    }
}
