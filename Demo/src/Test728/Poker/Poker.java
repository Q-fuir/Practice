package Test728.Poker;

public class Poker
{
    private String  colors;//扑克花色
    private   String  numbers;//扑克点数

    public Poker(){}

    public Poker(String colors,String numbers){
        this.colors=colors;
        this.numbers =numbers;
    }

    public String getColors()
    {
        return colors;
    }

    public void setColors(String colors)
    {
        this.colors = colors;
    }

    public String getNumbers()
    {
        return numbers;
    }

    public void setNumbers(String numbers)
    {
        this.numbers = numbers;
    }
}
