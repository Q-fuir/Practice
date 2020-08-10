

/*
输入一个数字，判断是一个奇数还是偶数。
 */

import java.util.Scanner;

public class P3_4
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个数字");
        Scanner san=new Scanner(System.in);
        int a = san.nextInt();
        if(a%2==0){
            System.out.println(a+"是偶数");
        }else{
            System.out.println(a+"是奇数");
        }
    }

}
