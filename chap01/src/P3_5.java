import java.util.Scanner;

/**
 * 编写程序， 判断一个变量x的值，如果是1，输出x=1，如果是5，输出x=5，如果是 10，输出x=10，除了以上几个值，都输出x=none。
 */

public class P3_5
{
    public static void main(String[] args)
    {
     System.out.println("请输入一个数");
        Scanner san = new Scanner(System.in);
        int x = san.nextInt();
        switch (x){
            case 1:
                System.out.println(x=1);
                break;
            case 5:
                System.out.println(x=5);
                break;
            case 10:
                System.out.println(x=10);
                break;
            default:
                System.out.println("none");
        }

    }

}
