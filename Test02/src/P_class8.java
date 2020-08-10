import java.util.Random;

public class P_class8
{
    public static void main(String[] args)
    {
        System.out.print("随机数是："+getNum(10));
    }
    public static  int getNum(int num){
        Random r = new Random();
        int sum = r.nextInt(num)+1;
            return sum;
    }
}
