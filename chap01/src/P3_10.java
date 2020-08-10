import java.util.Scanner;

/**
 * 编写一个程序，计算邮局汇款的汇费。如果汇款金额小于100元，汇费为一元，
 * 如果金额在100元与5000元之间，按1%收取汇费，如果金额大于5000元，汇费为50元。汇款金额由命令行输入。
 */

public class P3_10
{
    public static void main(String[] args)
    {
        System.out.println("请输入汇款金额");
        Scanner san = new Scanner(System.in);
        int money = san.nextInt();
        //汇费
        double cost;
        if(money<100){
                cost=1;
                System.out.println("汇费为"+cost);
        }else if(money>100&&money<5000){
            cost=money*0.01;
            System.out.println("汇费为"+cost);
        }else {
            cost=50;
            System.out.println("汇费为"+cost);
        }


    }
}
