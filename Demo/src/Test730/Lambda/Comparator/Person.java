package Test730.Lambda.Comparator;

import javafx.css.CssParser;

public class Person implements  Comparable<Person>
{
    String name;
    int  age;

    public Person(){}

    public Person(String name, int age){
        this.age= age;
        this.name =name;
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

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person)
    {
        int num = person.age-this.age;
        int num1=num==0?this.name.compareTo(person.name):num;
        return num1;
    }
}
