import java.util.Objects;

public class Demo01
{
    String name;
    String year;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public Demo01(){}

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Demo01)) return false;
        Demo01 demo01 = (Demo01) o;
        return Objects.equals(name, demo01.name) &&
                Objects.equals(year, demo01.year);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, year);
    }
}
