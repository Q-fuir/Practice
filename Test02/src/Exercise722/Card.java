package Exercise722;

public class Card
{
    String point;
    String suit;

    public Card()
    {
        super();
    }

    public Card(String suit, String point)
    {
        this.point = point;//点数
        this.suit = suit;//花色
    }

    public String getPoint()
    {
        return point;
    }

    public void setPoint(String point)
    {
        this.point = point;
    }

    public String getSuit()
    {
        return suit;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    //打印扑克信息
    public void cardMessage(){
        System.out.println(suit+point+"");
    }

}
