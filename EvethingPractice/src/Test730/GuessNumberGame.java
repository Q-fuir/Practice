package Test730;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame
{
    public static void main(String[] args)
    {
        guessNumber(100);
    }

    public static void guessNumber(int number){
        //随机数字
        Random random = new Random();
        int rNumber = random.nextInt(number)+1;
        int count=0;
        System.out.println("请输入你猜的数");
        while (true){
            count++;
            //键盘输入
            Scanner scanner = new Scanner(System.in);
            int GuessNumber = scanner.nextInt();
            if(GuessNumber>rNumber){
                System.out.println("大了"+"请再猜一次");
            }else if (GuessNumber<rNumber){
                System.out.println("小了"+"请再猜一次");
            }else {
                System.out.println("恭喜你！猜了"+count+"，终于猜中了！！！");
                break;
            }
        }
    }
}
