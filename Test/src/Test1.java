/**
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3
 *    编程找出1000以内的所有完数。
 */
public class Test1
{
    public static void main(String[] args)
    {

        int num =0;
        for(int i=1;i<=1000;i++){
            for (int j=1;j<i;j++){
             if (i%j==0){
                num=num+j;
             }
            }
            if(num==i) {
                System.out.println(num);
            }
            num=0;
        }

    }
}
