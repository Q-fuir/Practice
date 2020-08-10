package Test731;

public class Person
{
    String name ;//用户名
    int leftMoney;//余额

    public Person()
    {
    }

    public Person(String name, int leftMoney)
    {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLeftMoney()
    {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney)
    {
        this.leftMoney = leftMoney;
    }

    //展示信息
    public void showAll(){
        System.out.println("用户名:"+name+"\t"+"余额:"+leftMoney);
    }
}
