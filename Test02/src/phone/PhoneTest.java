package phone;

public class PhoneTest
{
    public static void main(String[] args)
    {
        phone p=new phone();
        p.setBrand("华为");
        p.setPrice(1800);
        p.setColor("red");
        phone p1=new phone("小米",799,"yellow");

        p.call("li");
        p.SendMessage();

        System.out.println(p.getBrand());
        System.out.println(p.getColor());
        System.out.println(p.getPrice());
        System.out.println(p1.getBrand()+"------"+p1.getColor()+"------"+p1.getPrice());




    }
}
