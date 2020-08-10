package Test728.CalenlarDemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class demo01
{
    public  static String  getLastDay(String yearMoth) throws ParseException
    {
        DateFormat  dateFormat = new SimpleDateFormat("yyyy-MM");
        Date date =dateFormat.parse(yearMoth);
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(date);
        int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return "yearMonth="+actualMaximum;
    }



    public static  int lastDay(int year,int month){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return actualMaximum;
    }

    public static void main(String[] args) throws ParseException
    {
        String str ="2020-07";
        System.out.println(getLastDay(str));
        int lastDay= lastDay(2020, 9);
        System.out.println(lastDay);
    }
}
