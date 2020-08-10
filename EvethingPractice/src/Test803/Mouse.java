package Test803;

public class Mouse implements USB
{

    @Override
    public void SHOW()
    {
        System.out.println("鼠标插入");
    }

    public void onClick(){
        System.out.println("被点击");
    }
}
