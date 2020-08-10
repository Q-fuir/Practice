package Test729.HomeWork.Practice_5;

import Test724.AfterPractice.P_4.Sun;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
 * 第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}
 */
public class TestMap5
{
    public static void main(String[] args)
    {
        String[] Keys = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] Values = {"哈尔滨","杭州","南昌","广州","福州"};

        Map<String,String> map =new HashMap<>();
        for (String key:Keys){
            for (String value:Values){
                map.put(key,value);
            }
        }

        Set<String> stringSet = map.keySet();
        for(String key: stringSet){
            String value =map.get(key);
            System.out.println(key+"="+value);
    }
    }
}
