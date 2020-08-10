package Test729.HashMapDemo.Practice_3;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        HashMap<Character,Integer> map = new HashMap<>();
        Character character;

        for (int i = 0; i <str.length(); i++) {
            character = str.charAt(i);

             if(!map.containsKey(character)) {
                map.put(character, 1);
            }else{
                Integer count =map.get(character);
                ++count;
                map.put(character,count);
            }

        }
        System.out.println(map);

        for (Character key:map.keySet()){
            Integer integer = map.get(key);
            System.out.println(key+"---"+integer);
        }

    }
}
