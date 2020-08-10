package Test728.StringBuilderDemo;

public class TestAppend
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append("hello").append(1000).append('A').append("world");
        System.out.println("append="+append);
    }
}
