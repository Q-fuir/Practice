package Test731;


import java.util.ArrayList;

public class Boss extends Person
{
    public Boss()
    {
    }

    public Boss(String name, int leftMoney)
    {
        super(name, leftMoney);
    }


    /**
     *
     * @param money   输入红包金额
     * @param count   红包个数
     */
    //发红包程序
    public  ArrayList<Integer> sendRedBag(int money ,int count){
        //建立红包
        ArrayList<Integer> arrayList = new ArrayList<>();
        int ave = money/count;
        int left = money-ave;
        for (int i = 0; i <count-1 ; i++) {
            arrayList.add(ave);
        }

        //最后特殊处理
        int lastMoney = left+ave;
        arrayList.add(lastMoney);
        //改变账户金额
        int updateMoney = super.leftMoney-money;
        super.setLeftMoney(updateMoney);
        return  arrayList;
    }
}
