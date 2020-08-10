package Exercise722;

public class Auto
{
    String brand;//品牌
    double price;//价格
    double length;//车长

    public Auto()
    {
        super();
    }

    public Auto(String brand, double price, double length)
    {
        this.brand = brand;
        this.price = price;
        this.length = length;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }
}
