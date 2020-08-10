import java.util.Scanner;

public class P_class5
{


    public static void main(String[] args)
    {
        System.out.println("请输入一个小数");
        Scanner san =new Scanner(System.in);
        double decimal1=san.nextDouble();
        System.out.println(decimal1+"->"+round(decimal1));
    }



    public static int round(double decimal){
        int num;
        if (decimal>=0.5){
            num=(int)(decimal+0.5);
        }else {
            num=(int)decimal;
        }
        return num;
    }

}
