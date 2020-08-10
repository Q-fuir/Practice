package Test724.AfterPractice.P_1;

public interface A
{
    public abstract  void showA();

    public default  void showB(){
        System.out.println("BBBB");
    }
}
