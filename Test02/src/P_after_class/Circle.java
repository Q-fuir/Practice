package P_after_class;



public class Circle
{
    final double Pi=3.14;
    double r;//圆的半径

    public Circle()
    {
        super();
    }

    public Circle(double r)
    {
        this.r = r;
    }

    public double getR()
    {
        return r;
    }

    public void setR(double r)
    {
        this.r = r;
    }


    //计算圆的周长
    public void showArea(double r){
        double S=Pi*r*r;
        System.out.println("圆的面积是："+S);
    }
    //计算圆的面积
    public void showPerimeter(double r){
        double C=2*Pi*r;
        System.out.println("圆的周长是："+C);
    }
}
