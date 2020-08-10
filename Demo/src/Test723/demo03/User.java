package Test723.demo03;

public class User
{
    String name;
    int leftMoney;

    public User()
    {
    }

    public User(String name, int leftMoney)
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

    //打印基本信息
    public void showMessage(){
        System.out.println("用户名："+name+" "+"余额："+leftMoney);
    }
}
