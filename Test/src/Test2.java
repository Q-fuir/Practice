/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
 *    求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Test2
{
    public static void main(String[] args)
    {
        double sum=0;
        double h=100;
        int i;
        for( i=10;i>0;i--){
            sum+=h;
            h*=0.5;
        }
        System.out.println(sum);
        System.out.println(h);
    }
}
