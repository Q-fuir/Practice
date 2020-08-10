package Exercise722;

import java.util.ArrayList;
import java.util.Random;

public class TestCard
{



    public static void main(String[] args)
    {
        //验证扑克牌是否存入集合
        ArrayList<Card> list =cardAll();
        for (int i = 0; i <list.size() ; i++) {
            Card card= list.get(i);
            System.out.println(card.getSuit()+card.getPoint());
        }
        System.out.println("---------------------------------");

       //验证RemoveCard方法
        int n=5;
       ArrayList<Card> arrayList=RemoveCard(5);
       System.out.println("随机"+n+"张牌：");
       if(arrayList!=null){
           for (int i = 0; i <arrayList.size(); i++) {
               Card card= arrayList.get(i);
               System.out.print(card.getSuit()+card.getPoint()+"\t");
           }
       }else {
           System.out.println("集合为null值");
       }

       System.out.println("\n");

        int m=55;
        ArrayList<Card> list1 =RemoveCard(55);
        System.out.println("随机"+m+"张牌：");
        if(list1!=null){
            for (int i = 0; i <list1.size() ; i++) {
                Card card = list1.get(i);
                System.out.println(card.getSuit()+card.getPoint()+"\t");
            }

        }else {
            System.out.println("超越范围，无法获取");
        }







    }

    //存储所有Card
    public  static ArrayList<Card> cardAll(){
        //suit花色
        String [] suit={"黑桃","方片","红桃","梅花"};
        //point点数
        String [] point={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //存储Card集合
        ArrayList<Card> list=new ArrayList<>();
        for (int i = 0; i <suit.length ; i++) {
            for (int j=0;j<point.length;j++){
                Card card = new Card(suit[i],point[j]);
                list.add(card);
            }
        }
        Card c1=new Card();
        Card c2=new Card();
        c1.suit="大";
        c1.point="王";
        c2.suit="小";
        c2.point="王";
        list.add(c1);
        list.add(c2);
        return  list;
    }

    //移除n张牌，存到新的集合
    public static  ArrayList<Card> RemoveCard(int n){
       ArrayList<Card> list = new ArrayList<>();
       ArrayList<Card> cards =cardAll();
       Random random = new Random();

        if(n>54||n<=0){
            return null;
        }else {
            for (int i = 0; i < n; i++) {
                int index = random.nextInt(cards.size());
                Card card = cards.remove(index);
                list.add(card);
            }
        }
        return list;
    }

}
