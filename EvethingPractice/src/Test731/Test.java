package Test731;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
         Boss boss = new Boss("洋洋",200);
      General general =new General("成员1",0);
        General general1 =new General("成员2",0);
        General general2=new General("成员3",0);
        boss.showAll();
        general.showAll();
        general1.showAll();
        general2.showAll();

        System.out.println("\n");


        ArrayList<Integer> arrayList =boss.sendRedBag(50,3);
         general.getMoney(arrayList);
         general1.getMoney(arrayList);
         general2.getMoney(arrayList);


        boss.showAll();
        general.showAll();
        general1.showAll();
        general2.showAll();

    }
}
