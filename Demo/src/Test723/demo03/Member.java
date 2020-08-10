package Test723.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User
{
    Member(){}


    public Member(String name, int leftMoney)
    {
        super(name, leftMoney);
    }

    //收钱方法
    public void getMoney(ArrayList<Integer> list){
        Random random = new Random();
        int index= random.nextInt(list.size());
        Integer money = list.remove(index);
        int leftMoney =super.getLeftMoney();
        super.setLeftMoney(money+leftMoney);
    }
}
