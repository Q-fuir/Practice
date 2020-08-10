package Test727.toStrinDemo;

public class TestPerson
{
    public static void main(String[] args)
    {
        Person p =new Person("海洋",20);
        Person p1 =new Person("海洋",20);
        Person p3 =new Person("海洋",20);
        Person p2 =new Person("洋洋",20);

        System.out.println(p1.equals(p3));


    }

}
