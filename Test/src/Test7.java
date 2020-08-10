/**
 *
 7. 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 分析：抓住分子与分母的变化规律。
 */
public class Test7
{
    public static void main(String[] args)
    {
        double sum=2/1;
        double fz=2;
        double fm=1;
        for(int i=2;i<=3;i++){
            fz=fz+fm;
            fm=fz-fm;
            sum+=fz/fm;
        }
        System.out.println(sum);

    }
}
