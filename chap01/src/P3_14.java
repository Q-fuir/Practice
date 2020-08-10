/**
 * 编写一个程序，找出大于200的最小的质数。
 */

public class P3_14
{
    public static void main(String[] args)
    {
        for(int i=201;;i++){
            boolean flag = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
        }

    }
}
