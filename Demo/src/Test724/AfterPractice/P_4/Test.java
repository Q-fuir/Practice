package Test724.AfterPractice.P_4;

public class Test
{
    public static void main(String[] args)
    {
        Star s = new Star();
        s.shine();
        System.out.println("================");
        Universe u = new Sun();
        u.doAnything();
        Sun s1 =(Sun) u;
        s1.shine();
    }
}
