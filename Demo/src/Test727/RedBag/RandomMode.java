package Test727.RedBag;

import Test727.RedBag.utils.OpenMode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode
{
    @Override
    public ArrayList<Integer> divide( int totalMoney, int totalCount)
    {
        //创建红包集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        //随机函数
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i <totalCount-1 ; i++) {
            int index =1+ random.nextInt(leftMoney/leftCount*2);
            arrayList.add(index);
            leftCount--;
            leftMoney-=index;

        }

        //处理最后一个
        arrayList.add(leftMoney);

        return arrayList;
    }
}
