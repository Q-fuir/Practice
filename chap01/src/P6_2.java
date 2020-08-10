/**
 * 定义一个矩形类Rectangle： a) 定义三个方法：getArea()求面积、getPer()求周长，
 * showAll()分别在控制台输出长、宽、面积、周长。 b)
 * 有2个属性：长length、宽width c) 通过构造方法Rectangle(int width, int length)，
 * 分别给两个属性赋值 d) 创建一个Rectangle对象，并输出相关信息
 */


public class P6_2
{
 int  Length;
 int Width;
 int Height;
 int C;
 int S;
 public P6_2(){}

 public  P6_2(int Width ,int Length )
 {
     this.Width=Width;
     this.Length= Length;
 }
 //求面积方法
 public void getArea(){
     S=Length*Width*Height;
     System.out.println("长方形面积是："+S);
 }
 //求周长方法
  public void  getPer(){
      C=(Length+Width)*2;
      System.out.println("长方形面积是："+C);
  }

  //showAll()
    public void showAll(){
     System.out.println("长方形宽是："+Width+" "+"长方形长是："+Length+" "+"长方形高是："+Height);
        getArea();
        getPer();
    }
    //Rectangle相关信息方法
    public void  Rectangle(){
     System.out.println("长方形宽是"+Width+" "+"长方形长是："+Length);
    }

}
