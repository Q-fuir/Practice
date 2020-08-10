package Test803;

public class TestComputer
{
    public static void main(String[] args)
    {
      Computer computer =new Computer();
      computer.OPEN();
      USB m=new Mouse();
      computer.usb(m);

        USB k=new Mouse();
        computer.usb(k);
        computer.CLOSE();

    }
}
