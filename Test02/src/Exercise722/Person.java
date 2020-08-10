package Exercise722;

public class Person
{
    String name;//姓名
    int age;//年龄

    public Person()
    {
        super();
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    //打印基本信息
    public  void  showMsg(){
            System.out.println("姓名："+name+"年龄："+age);
    }
}
