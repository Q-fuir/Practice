package Test730.Lambda;

public class Demo
{
    public static void main(String[] args)
    {
        invoke(()->{
            System.out.println("lambda");
        });

    }

    public  static  void invoke(Cook cook){
        cook.makeFood();
    }
}
