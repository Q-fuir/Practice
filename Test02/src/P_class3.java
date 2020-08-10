import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P_class3
{
    public static void  array(int []a){
        System.out.print("\n"+"逆序数组是：");
        int m;
        for (int i=0;i<a.length/2;i++){

            m=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=m;

        }

    }
    public static void main(String[] args)
    {
        int[] arr={1,6,8,9};
        array(arr);
        System.out.println(Arrays.toString(arr));
    }
}
