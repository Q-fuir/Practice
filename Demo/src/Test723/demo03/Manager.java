package Test723.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends  User
{
    Manager(){
    }


    public Manager(String name, int leftMoney)
    {
        super(name, leftMoney);
    }

    //发红包
    public ArrayList<Integer>  sendMoney(int money,int count){
                ArrayList<Integer> arrayList = new ArrayList<>();
                if(money>super.leftMoney){
                    System.out.println("余额不足");
                }
                    super.setLeftMoney(super.leftMoney-money);
                    int ave =money/count;
                    int left=money-ave;
                    for (int i = 0; i < count; i++) {
                        arrayList.add(ave);
                    }
                    int last =ave+left;
                    arrayList.add(last);

                return arrayList;
    }
}
