package Test803;

public class KeyAround implements USB
{
    @Override
    public void  SHOW(){
        System.out.println("键盘插入");
    }

    public  void Type(){
        System.out.println("被敲击");
    }
}
