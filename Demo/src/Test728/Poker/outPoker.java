package Test728.Poker;

import Test723.demo04.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class outPoker
{
    public void OutPoker(){
        //取牌
        AddPoker addPoker = new AddPoker();
        ArrayList<String> arrayList =addPoker.addPoker();
        //玩家
        Player player1= new Player();
        player1.setPlayerName("John");
        Player player2= new Player();
        player2.setPlayerName("Sunny");
        Player player3= new Player();
        player3.setPlayerName("Tina");
        //创建玩家集合
        ArrayList<String> playerList = new ArrayList<>();
        playerList.add(player1.getPlayerName());
        ArrayList<String> player1List = new ArrayList<>();
        player1List.add(player2.getPlayerName());
        ArrayList<String> player2List = new ArrayList<>();
        player2List.add(player3.getPlayerName());

        //创建底牌集合
        ArrayList<String> lastPoker = new ArrayList<>();

        //发牌
        for (int i = 0; i <arrayList.size() ; i++) {
            if(i>=(arrayList.size()-3)){
                lastPoker.add(arrayList.get(i));
            }else  if (i%3==0){
                playerList.add(arrayList.get(i));
            }else  if(i%3==1){
                player1List.add(arrayList.get(i));
            }else if (i%3==2){
                player2List.add(arrayList.get(i));
            }
        }

        //看牌
        LookPoker lookPoker = new LookPoker();
        lookPoker.lookPoker(player1.getPlayerName(),playerList);
        lookPoker.lookPoker(player2.getPlayerName(),player1List);
        lookPoker.lookPoker(player3.getPlayerName(),player2List);
        lookPoker.lookPoker("底牌",lastPoker);


    }
}
