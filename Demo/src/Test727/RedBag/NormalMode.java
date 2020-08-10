package Test727.RedBag;

import Test727.RedBag.utils.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode
{
    @Override
    public ArrayList<Integer> divide( final int totalMoney,final int totalCount)
    {
        //创建红包集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        int ave = totalMoney/totalCount;//红包平均值
        int mod =totalMoney%totalCount;//红包零头
        for (int i = 0; i <totalCount-1 ; i++) {
            arrayList.add(ave);
        }
        //零头处理
        int last = ave+mod;
        arrayList.add(last);

        return arrayList;
    }
}
