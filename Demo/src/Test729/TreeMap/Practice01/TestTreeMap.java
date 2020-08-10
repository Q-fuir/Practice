package Test729.TreeMap.Practice01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 */
public class TestTreeMap
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        TreeMap<Character,Integer> treeMap = new TreeMap<>();

        char[] chars =line.toCharArray();

        for (char c:chars){
            Integer i = treeMap.get(c);
            if(i==null){
                treeMap.put(c,1);
            }else {
                i++;
                treeMap.put(c,i);

            }
        }

        StringBuilder builder = new StringBuilder();

        Set<Character> characterSet =treeMap.keySet();
        for (Character character:characterSet){
            Integer value = treeMap.get(character);
            builder.append(character).append("(").append(value).append(")");
        }

        String str = builder.toString();
        System.out.println("str="+str);

    }
}
