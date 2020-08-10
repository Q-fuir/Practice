import java.util.Scanner;

/**
 * 输入三个整数x,y,z，请把这三个数由小到大输出
 */

public class P3_9
{
    public static void main(String[] args)
    {
        Scanner san =new Scanner(System.in);
        int j;
        System.out.println("请输入整数x");
        int x= san.nextInt();
        System.out.println("请输入整数y");
        int y= san.nextInt();
        System.out.println("请输入整数z");
        int z= san.nextInt();
        if(x>y){
            j=y;
            y=x;
            x=j;
        }
        if(x>z){
            j=z;
            z=x;
            x=j;
        }
        if(y>z){
            j=z;
            z=y;
            y=j;
        }
        System.out.println(x+" "+y+" "+z);


    }
}
