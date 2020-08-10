import java.util.Scanner;

/**
 * 给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
 */
public class P3_3
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个数");
        Scanner san = new Scanner(System.in);
        int i = san.nextInt();
        int ge,shi,bai,qan;
        int sum=0;
        if(i>=10&&i<100){
            ge=i%10;
            shi=i/10%10;
            sum=ge+shi;
            System.out.println(sum);
        }else if(i>=100&&i<1000){
            ge=i%10;
            shi=i/10%10;
            bai=i/100;
            sum=ge+shi+bai;
            System.out.println(sum);
        }else if(i==1000) {
            ge=i%10;
            shi=i/10%10;
            bai=i/100%10;
            qan=i/1000;
            sum=ge+shi+bai+qan;
            System.out.println(sum);
        }else {
            sum=i;
            System.out.println(sum);
        }




    }
}
