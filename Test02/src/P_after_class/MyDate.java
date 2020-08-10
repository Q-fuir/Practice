package P_after_class;

public class MyDate
{
    int year;
    int month;
    int day;

    public MyDate()
    {
        super();
    }

    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    //打印日期方法
    public void  showDate(int year,int month,int day){
            System.out.println("日期是："+year+"年"+month+"月"+day+"日");
    }

    //判断年饭是否为闰年方法
    public void  isBi(int year){
        if (year%4==0&&year%100!=0) {
            System.out.println(year+"是闰年");
        }else if (year%400==0&&year%100==0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }

}
