import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 *输入一个年份，判断这个年份是否是闰年
 */


public class P3_7
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个年份");
        Scanner san = new Scanner(System.in);
        int Year =san.nextInt();
        if(Year%4==0||Year%100!=0&&Year%400==0){
                    System.out.println("是闰年");
        }else{
            System.out.println("是平年");
        }


    }
}
