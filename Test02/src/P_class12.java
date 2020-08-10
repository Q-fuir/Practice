/**
 * 定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
 */
public class P_class12
{
    public static void getValue( String str,int a,int b,int c){
        if(str.equals("最大值")){
            System.out.println("最大值是"+getMax(a,b,c));
        }else if(str.equals("最小值")){
            System.out.println("最大值是"+getMin(a,b,c));
        }
    }
    public static int  getMax(int a,int b,int c){
        int x=a>b?a:(b>c?b:c);
        return x;
    }
    public static int  getMin(int a,int b,int c){
        int y=a<b?a:(b<c?b:c);
        return y;
    }

    public static void main(String[] args)
    {
        getValue("最大值",55,9999,10000);
    }
}
