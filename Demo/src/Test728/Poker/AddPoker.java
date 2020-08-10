package Test728.Poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 生产扑克  "♥" "♣" "♦" "♠"
 */
public class AddPoker
{
    public  ArrayList<String> addPoker(){
        //花色对象
        Poker p1 = new Poker();
        Poker p2 = new Poker();
        Poker p3 = new Poker();
        Poker p4 = new Poker();

        //点数对象
        Poker poker = new Poker();//数字对象
        Poker pokerBigKing =new Poker();//大王对象
        Poker pokerSmallKing =new Poker();//小王对象
        Poker pokerA =new Poker();//A对象
        Poker pokerJ =new Poker();//J对象
        Poker pokerK =new Poker();//K对象
        Poker pokerQ =new Poker();//Q对象

        //生成牌盒
        ArrayList<String> arrayList = new ArrayList<>();
        //花色
        ArrayList<String > listColors = new ArrayList<>();
        p1.setColors("♥");
        p2.setColors("♣");
        p3.setColors("♦" );
        p4.setColors("♠");
        listColors.add(p1.getColors());
        listColors.add(p2.getColors());
        listColors.add(p3.getColors());
        listColors.add(p4.getColors());
        //点数
        ArrayList<String> listNumbers= new ArrayList<>();
        for (int i =2; i <=10 ; i++) {
            poker.setNumbers(i+"");
            listNumbers.add(poker.getNumbers());
        }
        pokerJ.setNumbers("J");
        pokerQ.setNumbers("Q");
        pokerK.setNumbers("K");
        listNumbers.add(pokerJ.getNumbers());
        listNumbers.add(pokerK.getNumbers());
        listNumbers.add(pokerQ.getNumbers());

        //装牌
        for(String color:listColors){
            for(String number:listNumbers){
                arrayList.add(color.concat(number));
            }
        }

        pokerBigKing.setNumbers("大王");
        arrayList.add(pokerBigKing.getNumbers());
        pokerSmallKing.setNumbers("小王");
        arrayList.add(pokerSmallKing.getNumbers());

        //洗牌
        Collections.shuffle(arrayList);

        return arrayList;
    }


//    public static void main(String[] args)
//    {
//        ArrayList<String> arrayList = addPoker();
//        System.out.println(arrayList);
//    }
}
