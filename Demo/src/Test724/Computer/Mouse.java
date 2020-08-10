package Test724.Computer;

public class Mouse implements USB
{
    @Override
    public void open()
    {
        System.out.println("鼠标开启");
    }

    @Override
    public void close()
    {
        System.out.println("鼠标关闭");
    }

    //鼠标点击方法
    public  void click(){
        System.out.println("鼠标点击");
    }
}
