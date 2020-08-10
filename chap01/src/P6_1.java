/**
 * 定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，2个构造方法Point()和Point(int x0,y0),
 * 以及一个movePoint（int dx,int dy）方法实现点的位置移动，
 * 创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。。
 */


public class P6_1
{
    String X;
    String y;

    public P6_1()
    {
        super();
    }
    public  P6_1(String X,String y){
        this.X=X;
        this.y=y;
    }
    public  void  movePoint(){
        System.out.println("横坐标"+X+","+"纵坐标"+y);
    }

}
