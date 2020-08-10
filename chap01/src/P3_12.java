/**
 * 输出0-9之间的数，但是不包括5。
 */

public class P3_12
{
    public static void main(String[] args)
    {
        for (int i=0;i<=9;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
