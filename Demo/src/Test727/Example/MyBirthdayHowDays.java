package Test727.Example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyBirthdayHowDays
{
    public static void main(String[] args) throws ParseException
    {
        function();
    }

    public static void  function() throws ParseException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出生日期 格式：yyyy-MM-dd");
        //当前时间
        long date=new Date().getTime();
        //出生日期
        String data1 = scanner.next();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse(data1);
        long birthday = d.getTime();
        //日期差
        long lastDate = date-birthday;
        //毫秒转天
        int day = (int) (lastDate/1000/60/60/24);
        System.out.println("出生了"+day+"天");


    }

}
