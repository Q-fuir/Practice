package P_after_class;

public class Coder
{
    String CoderName;//员工姓名
    String CoderNumber;//员工工号
    int CoderBasePay;//员工基本工资

    public Coder()
    {
        super();
    }

    public Coder(String coderName, String coderNumber, int coderBasePay)
    {
        CoderName = coderName;
        CoderNumber = coderNumber;
        CoderBasePay = coderBasePay;
    }

    public String getCoderName()
    {
        return CoderName;
    }

    public void setCoderName(String coderName)
    {
        CoderName = coderName;
    }

    public String getCoderNumber()
    {
        return CoderNumber;
    }

    public void setCoderNumber(String coderNumber)
    {
        CoderNumber = coderNumber;
    }

    public int getCoderBasePay()
    {
        return CoderBasePay;
    }

    public void setCoderBasePay(int coderBasePay)
    {
        CoderBasePay = coderBasePay;
    }

    //打印姓名，工号信息
    public void intro(String CoderName,String CoderNumber){
        System.out.println("员工姓名："+CoderName+"\n"+"工号："+CoderNumber);
    }
    //打印薪资信息
    public void showSalary(int CoderBasePay ){

        System.out.println("基本工资为："+CoderBasePay+"奖金为：无");

    }
    //打印工作信息
    public void work(){
        System.out.println("正在努力的写的代码.....");
    }
}
