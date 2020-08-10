import java.util.Scanner;

/**
 * 5. 输入某年某月某日，判断这一天是这一年的第几天？
 *    分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，
 *    闰年且输入月份大于3时需考虑多加一天。
 */
public class Test5
{
    public static void main(String[] args)
    {
        Scanner san =new Scanner(System.in);
        int year = san.nextInt();
        int month=san.nextInt();
        int day=san.nextInt();
        switch(month){
            case 1:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 2:
                if(year%4==0&&year%100!=0||year%400==0){
                day+=29;
                System.out.println(year+"年"+"第几天"+day);
                break;
                }else{
                    day+=28;
                    System.out.println(year+"年"+"第几天"+day);
                }
            case 3:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 4:
                day+=30;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 5:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 6:
                day+=30;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 7:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 8:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 9:
                day+=30;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 10:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 11:
                day+=30;
                System.out.println(year+"年"+"第几天"+day);
                break;
            case 12:
                day+=31;
                System.out.println(year+"年"+"第几天"+day);
                break;

        }
    }
}
