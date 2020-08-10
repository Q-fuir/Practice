import java.util.Scanner;

/**
 *  一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Test9
{
    public static void main(String[] args)
    {
        Scanner san = new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int x=san.nextInt();
        int ge=x%10;
        int shi=x/10%10;
        int wan=x/10000;
        int qan =x/1000%10;

        if(ge==wan&&shi==qan){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }


    }
}
