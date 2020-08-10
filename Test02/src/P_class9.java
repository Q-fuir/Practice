import java.util.Random;
import java.util.Scanner;

public class P_class9
{
    public static void main(String[] args)
    {
       System.out.println(getNumberGame(1000));
    }
    public static int getNumberGame(int num){
        Scanner san= new Scanner(System.in);
        Random r  =  new Random();
        int number=r.nextInt(num)+1;
        int count=0;
        for (int i=1;;i++) {
            count++;
            System.out.println("请输入你猜的数");
            int guessNumber=san.nextInt();
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜了"+count+"次");
                System.out.println("恭喜你！你猜对了" + "数字是： "+guessNumber);
                break;
            }


        }
       return number;
    }

}
