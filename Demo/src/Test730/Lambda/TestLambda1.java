package Test730.Lambda;

public class TestLambda1
{
    public static void main(String[] args)
    {
            invoke(new Cook()
            {
                @Override
                public void makeFood()
                {
                    System.out.println("饭好了");
                }
            });



    }

    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
