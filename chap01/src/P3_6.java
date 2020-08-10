import java.util.Scanner;

/**
 * 判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），
 * 或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
 */

public class P3_6
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个数字");
        Scanner san = new Scanner(System.in);
        int number = san.nextInt();
        if(number%5==0&&number%6==0){
            System.out.println("能被5和6同时整除的的数是"+number);
        }else if(number%5==0||number%6==0){
            System.out.println("只能被5或6同时整除的的数是"+number);
        }else{
            System.out.println("不能能被5或6同时整除的的数是"+number);
        }
    }
}
