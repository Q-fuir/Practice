package Test724.Computer;

public class Test
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.run();

        USB m =new Mouse();
        USB k =new KeyBoard();
        computer.useUsb(m);
        computer.useUsb(k);

        computer.shutDown();

    }
}
