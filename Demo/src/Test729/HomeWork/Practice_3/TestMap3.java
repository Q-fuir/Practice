package Test729.HomeWork.Practice_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
 */
public class TestMap3
{
    public static void main(String[] args)
    {
        Map<Car,Double> map =new HashMap<>();
        map.put(new Car("奥迪","red"),15550.5);
        map.put(new Car("奔驰","block"),15566.5);
        map.put(new Car("宝马","white"),25133.5);

        //entrySet方式遍历
        Set<Map.Entry<Car,Double>> entrySet = map.entrySet();
        for (Map.Entry<Car,Double> me:entrySet){
            Car car =me.getKey();
            Double price =me.getValue();
            System.out.println(car.getName()+"----"+car.getColor()+"-------"+price);

        }

        System.out.println();


        //keySet方式遍历
        Set<Car> carSet = map.keySet();
        for (Car key:carSet){
            Double price = map.get(key);
            System.out.println(key.getName()+"----"+key.getColor()+"-------"+price);

        }



    }
}
