import java.util.Scanner;

/**
 * 由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
 */

public class P3_15
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个4位数");
        Scanner san = new Scanner(System.in);
        int number=san.nextInt();
        int ge =number%10;
        int shi =number/10%10;
        int bai=number/100%10;
        int qan = number/1000;
        int sum=0;
        sum=ge*1000+shi*100+bai*10+qan;
        System.out.println("调整后"+sum);

    }
}
