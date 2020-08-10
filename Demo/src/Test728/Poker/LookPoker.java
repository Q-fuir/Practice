package Test728.Poker;

import java.util.ArrayList;

public class LookPoker
{
    //看牌
    public void lookPoker( String name,ArrayList<String> list){

        System.out.print(name+" 的牌是: ");

        for (String string:list) {
            System.out.print(string+" ");
        }
        System.out.println();
    }
}
