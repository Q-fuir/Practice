package Test725.demo01;

import Test725.demo01.Person;

public class Test
{
    public static void main(String[] args)
    {
        Person person = new Person();
        Person.Heart heart =person.new Heart();

        heart.Heart();
        person.setLive(false);
        heart.Heart();



    }




}
