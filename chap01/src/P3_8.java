import java.util.Scanner;

/**
 * 输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E。
 */


public class P3_8
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个分数");
        Scanner  san = new Scanner(System.in);
        int grade = san.nextInt();
        int i= grade/10;
        if(grade>=0&&grade<=100){
            switch (i){
                case 10:
                case 9 :
                    System.out.println("你的分数等级是A");
                    break;
                case 8:
                    System.out.println("你的分数等级是B");
                    break;
                case 7:
                    System.out.println("你的分数等级是C");
                    break;
                case 6:
                    System.out.println("你的分数等级是D");
                    break;
                default:
                    System.out.println("你的分数等级是E");
                    break;
            }
        }else {
            System.out.println("打印分数无效");
        }
    }
}
