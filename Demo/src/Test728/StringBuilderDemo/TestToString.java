package Test728.StringBuilderDemo;

public class TestToString
{
    public static void main(String[] args)
    {
        StringBuilder builder =new StringBuilder("Hello").append("world").append("java");
        System.out.println(builder.toString());

    }
}
