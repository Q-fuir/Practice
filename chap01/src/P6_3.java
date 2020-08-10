/**
 * 定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 a) 无参和有参的两个构造方法；
 * 有参构造方法可以在创建对象的同时为每个属性赋值； b) 输出笔记本信息的方法 c) 然后编写一个测试类，测试笔记本类的各个方法。
 */
public class P6_3
{
    char color ;
    int cpuMath;

    public P6_3()
    {
        super();
    }

    public P6_3(char color, int cpuMath)
    {
        this.color = color;
        this.cpuMath = cpuMath;
    }

    public void showAll(){
        System.out.println("笔记本的颜色是："+color+"    "+"笔记本cpu型号是："+cpuMath);
    }
}
