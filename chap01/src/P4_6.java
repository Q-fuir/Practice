/**
 *   将一个数组中的元素逆序存放。
 */
public class P4_6
{
    public static void main(String[] args)
    {
        int [] a={1,2,4,3};
        int m;
        System.out.print("原数组是：");
        for (int i :a
             ) {
            System.out.print(i+"  ");

        }


        System.out.print("\n"+"逆序数组是：");
        for (int i=0;i<a.length/2;i++){

                m=a[i];
                a[i]=a[a.length-i-1];
                a[a.length-i-1]=m;

        }

        for (int i:a) {
            System.out.print(i+"  ");
        }
    }
}
