package Exercise722;

public class SUV extends Auto
{
    double SmallCar=4295;//小型车标准车长
    double MidCar=5070;//中型车标准车长



    //判断车型方法
    public void judgeLength(double length)
    {
        double carLength=super.getLength();
        if(carLength>SmallCar&&carLength<=MidCar){
            System.out.println("车型："+super.getBrand()+"\n"+"\t"+"价格："+super.getPrice()+"\n"+"\t"+"车长："+super.getLength());
        }
    }
}
