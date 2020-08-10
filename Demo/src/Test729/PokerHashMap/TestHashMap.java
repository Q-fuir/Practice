package Test729.PokerHashMap;

import Test723.demo04.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TestHashMap
{
    public static void main(String[] args)
    {
        //创建HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //创建ArrayList集合,放入牌编号
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        //创建牌花色、点数集合
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        //将花色、点数存入集合
        Collections.addAll(colors," ♥","♣" ,"♦" ,"♠");
        Collections. addAll(numbers,"A","2","3","4","5","6","7","8","9","10","J","Q","K");
        //存牌
        int index=0;
        for (String color:colors){
            for (String number:numbers){
                hashMap.put(++index,color.concat(number));
                integerArrayList.add(index++);
            }
        }
        //将大小王加入hasMap
        hashMap.put(++index,"大王");
        integerArrayList.add(index);
        hashMap.put(++index,"小王");
        integerArrayList.add(index);
//        System.out.println(integerArrayList);
//        System.out.println(hashMap);
        //洗牌
        Collections.shuffle(integerArrayList);

        //用编号发牌
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> num4 = new ArrayList<>();

        //发编号
        for (int i = 0; i <integerArrayList.size() ; i++) {
            Integer integer = integerArrayList.get(i);
            if(i>=(integerArrayList.size()-3)){
                num4.add(integer);
            }else if (i%3==0){
                num1.add(integer);
            }else if (i%3==1){
                num2.add(integer);
            }else if (i%3==2){
                num3.add(integer);
            }
        }

        //调顺序
        Collections.sort(num1);
        Collections.sort(num2);
        Collections.sort(num3);
        Collections.sort(num4);

        //创建玩家牌
        ArrayList<String> player = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> lastPoker = new ArrayList<>();

        for(Integer integer:num1){
            player.add(hashMap.get(integer));
        }
        for(Integer integer:num2){
            player1.add(hashMap.get(integer));
        }
        for(Integer integer:num3){
            player2.add(hashMap.get(integer));
        }
        for(Integer integer:num4){
            lastPoker.add(hashMap.get(integer));
        }

        //看牌
        lookPoker("Sunny",player);
        lookPoker("Tina",player1);
        lookPoker("Mini",player2);
        lookPoker("底牌",lastPoker);



    }

    public static  void lookPoker(String name,ArrayList<String> arrayList){
        System.out.println(name+"的牌是：");

        for (String s:arrayList){
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
