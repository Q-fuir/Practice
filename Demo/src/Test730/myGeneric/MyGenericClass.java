package Test730.myGeneric;

public class MyGenericClass<MVP>
{
    //没有MVP类型，在这里代表未知的一种数据类型
    //未来所传递什么类型就是什么类型
    private MVP mvp;

    public  MyGenericClass(){}

    public  MyGenericClass(MVP mvp){
        this.mvp=mvp;
    }

    public MVP getMvp()
    {
        return mvp;
    }

    public void setMvp(MVP mvp)
    {
        this.mvp = mvp;
    }
}
