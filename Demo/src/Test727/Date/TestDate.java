package Test727.Date;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDate
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date);
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String str = simpleDateFormat.format(date);
        System.out.println(str);




    }
}
