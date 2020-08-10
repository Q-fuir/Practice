package P_after_class;

public class TestManager
{
    public static void main(String[] args)
    {
        Manager manager = new Manager();
        manager.intro("James","9527");
        manager.showSalary(15000,3000);
        manager.work();
        System.out.println("=========");

        Coder coder = new Coder();
        coder.intro("Kode","0025");
        coder.showSalary(10000);
        coder.work();
    }
}
