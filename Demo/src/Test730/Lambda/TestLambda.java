package Test730.Lambda;

import java.util.Arrays;
import java.util.List;

public class TestLambda
{

    public static void main(String[] args)
    {
        iterTest();
    }


    public static void iterTest() {
        List<String> languages = Arrays.asList("java","scala","python");
        //before java8
        for(String each:languages) {
            System.out.println(each);
        }
        //after java8
        languages.forEach(x -> System.out.println(x));
        languages.forEach(System.out::println);
    }
}
