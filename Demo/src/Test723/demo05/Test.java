package Test723.demo05;

import java.util.HashMap;

public class Test
{
    public static void main(String[] args)
    {
        Duck duck = new Duck();
        duck.setName("鸭子");
        duck.setAge(2);
        duck.setIllness("感冒");
        duck.setSymptom("发烧");
        duck.showMsg();
        duck.showSymptom();

    }
}
