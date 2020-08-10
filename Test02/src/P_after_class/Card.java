package P_after_class;

public class Card
{
    String point;
    String suit;

    public Card()
    {
        super();
    }

    public Card(String point, String suit)
    {
        this.point = point;
        this.suit = suit;
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

    //打印牌面信息
    public void showCard( String suit,String point){
        System.out.println(suit+""+point);
    }

}
