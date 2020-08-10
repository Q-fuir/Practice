/**
 * 1. 定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
 * 2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
 * 3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
 * 4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
 * 5. main方法中,调用printNum方法,传入a,b
 * 6. main方法中,调用doubling方法,传入a,b
 * 7. main方法中,调用printNum方法,传入a,b
 * 8. main方法中,调用doubling方法,传入a,用a接收返回值
 * 9. main方法中,调用doubling方法,传入b,用b接收返回值
 * 10. main方法中,调用printNum方法,传入a,b
 */
public class P_class6
{
    public static  void printNum(int iVar,int iVar2){
        System.out.println("iVar="+iVar+" "+"iVar2="+iVar2);
    }
    public static  void doubling(int r, int p){
        int b=2*r;
       int a=2*p;
        printNum(b,a);
    }

    public static  int  doubling(int r){
        doubling(r,0);
        return r;
    }

    public static void main(String[] args)
    {
        int a=10;
        int b=10;

        printNum(a,b);
        doubling(a,b);
        doubling(a);

    }
}
