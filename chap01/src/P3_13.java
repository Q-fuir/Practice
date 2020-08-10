import java.util.Scanner;

/**
 * 编写一个程序，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
 */

public class P3_13
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个整数");
        Scanner san= new Scanner(System.in);
        int n=san.nextInt();
        int sum=1;
        for (int i=1;i<=n;i++){
            sum*=i;
        }
        System.out.println("阶乘是"+sum);
    }
}
