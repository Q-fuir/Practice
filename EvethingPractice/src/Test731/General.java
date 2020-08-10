package Test731;

import java.util.ArrayList;
import java.util.Random;

public class General extends  Person
{
    public General()
    {
    }

    public General(String name, int leftMoney)
    {
        super(name, leftMoney);
    }

    //收红包
    public void getMoney(ArrayList<Integer> list){
        Random random = new Random();
        int getMoney = random.nextInt(list.size());
        Integer index = list.remove(getMoney);
        int leftMoney = super.getLeftMoney();
        super.setLeftMoney(index+leftMoney);

    }

    }
