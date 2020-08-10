package Test727.HomeWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 1、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 * 2、五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08
 */
public class Test
{
    public static void main(String[] args) throws ParseException
    {
       change();
       DateChangeString();
    }

    /**
     * 1、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
     */
    public static void change() throws ParseException
    {
        //定义2018-03-04
        String date = "2018-03-04";
        //解析date
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        //将String date转成Date date
        Date date1 =dateFormat1.parse(date);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        //再转成要求值
        String  str = dateFormat2.format(date1);
        System.out.println(str);
    }

    /**
     *  2、五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08
     */

    public  static void DateChangeString(){
        //获取当前的日期
        Date  date = new Date();
        //解析date
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //转成String date
        String str = dateFormat.format(date);
        System.out.println(str);



    }

}
