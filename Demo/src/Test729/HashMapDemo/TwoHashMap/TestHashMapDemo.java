package Test729.HashMapDemo.TwoHashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * 传智播客
 *      jc 基础班
 *              叶冰   22
 *              木澜花  20
 *     jy 毕业班
 *              柔情水  21
 *              楚瑶     23
 */
public class TestHashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String ,HashMap<String,Integer>> czMap = new HashMap<>();
        //创建基础班集合
        HashMap<String,Integer> jcMap = new HashMap<>();
        //添加元素
        jcMap.put("叶冰",22);
        jcMap.put("木澜花",20);
        czMap.put("基础班",jcMap);

        //创建毕业班集合
        HashMap<String,Integer> jyMap = new HashMap<>();
        //添加元素
        jyMap.put("柔情水",21);
        jyMap.put("楚瑶",23);
        czMap.put("毕业班",jyMap);


        //遍历集合
        Set<String> czMapSet = czMap.keySet();
        for (String czMapKey:czMapSet){
            System.out.println(czMapKey+":");
            HashMap<String,Integer> czMapValue =czMap.get(czMapKey);
            Set<String> czMapKeyKey =czMapValue.keySet();
            for (String czMapKeyKeyKey:czMapKeyKey){
                Integer czMapValueValue =czMapValue.get(czMapKeyKeyKey);
                System.out.println("\t"+czMapKeyKeyKey+"----"+czMapValueValue);
            }
        }


    }
}
