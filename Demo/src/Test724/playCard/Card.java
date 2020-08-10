package Test724.playCard;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 模拟斗地主洗牌和发牌
 *
 *   分析：
 *   		A:创建一个牌盒
 *  		B:装牌
 *  		C:洗牌
 *  		D:发牌
 *  		E:看牌
 *
 */
public class Card
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] colors ={"♠", "♥", "♣", "♦"};
        String[] numbers={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (String color: colors) {
            for (String number:numbers) {
                arrayList.add(color.concat(number));
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");

        Iterator<String > iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);

        }
    }

}
