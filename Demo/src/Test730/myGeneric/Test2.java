package Test730.myGeneric;

public class Test2
{
    public static void main(String[] args)
    {
        MyGenericMethod myGenericMethod =new MyGenericMethod();
        //在调用方法时定义泛型
        myGenericMethod.show("aaa");
        myGenericMethod.show(1233);
        myGenericMethod.show(0.215);
    }
}
