package Test730.myGeneric;

public class Test
{
    public static void main(String[] args)
    {
        //创建一个泛型String类
        MyGenericClass<String> myGenericClass =new MyGenericClass<>();
        myGenericClass.setMvp("哈登哥");
        String mvp = myGenericClass.getMvp();
        System.out.println(mvp);


        MyGenericClass<Integer> my2 =new MyGenericClass<>();
        my2.setMvp(13);
        Integer mvp2 =my2.getMvp();
        System.out.println(mvp2);
    }
}
